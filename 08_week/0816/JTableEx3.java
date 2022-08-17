import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class BookManager extends JFrame implements ActionListener{
	JTable tbl;
	DefaultTableModel model;
	JTextField tfTitle, tfWriter;
	JButton btnAdd,btnDel,btnSave,btnLoad;
	int index;
	
	File file;
	FileWriter fw;
	PrintWriter pw;
	
	FileReader fr;
	BufferedReader br;
	
	BookManager(){
		file = new File("./bookList.txt");
		index = 1;
		this.setSize(500,400);
		this.setDefaultCloseOperation(3);
		this.setLayout(new BorderLayout());

		String[] header = {"번호","제목","작성자","작성시간"};
		String[][] contents = {};

		model = new DefaultTableModel(contents,header);
		tbl = new JTable(model);
		JScrollPane sp = new JScrollPane(tbl);
		this.add(sp);
		
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new FlowLayout());
		
		tfTitle = new JTextField(10);
		tfTitle.setToolTipText("제목");
		pnl.add(tfTitle);
		
		tfWriter = new JTextField(8);
		tfTitle.setToolTipText("작성자");
		pnl.add(tfWriter);
		
		btnAdd= new JButton("추가");
		btnAdd.addActionListener(this);
		pnl.add(btnAdd);
		
		btnDel = new JButton("제거");
		btnDel.addActionListener(this);
		pnl.add(btnDel);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(this);
		pnl.add(btnSave);
		
		btnLoad = new JButton("로드");
		btnLoad.addActionListener(this);
		pnl.add(btnLoad);
		
		this.add(pnl,"South");
		
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAdd) {
			Calendar calendar = Calendar.getInstance();
			String[] object = new String[4];
//			object[0]= model.getValueAt(model.getRowCount()-1, 0).toString() ;
			object[1]= tfTitle.getText();
			object[2]= tfWriter.getText();
			object[3]= calendar.getTime()+"";
			
			model.addRow(new String[] {(index++)+""});
		}
		else if(e.getSource()== btnDel) {
			if(tbl.getSelectedRow()>=0) {
				model.removeRow(tbl.getSelectedRow());	
			}
		}
		else if(e.getSource() == btnSave) {
			try {
				fw = new FileWriter(file);
				pw = new PrintWriter(fw);
				
				int rowCount = model.getRowCount();
				int colCount = model.getColumnCount();
				
				String temp = "";
				
				for(int i= 0 ; i < rowCount ; i++) {
					temp = "";
					for(int j = 0 ; j < colCount ; j++) {
						temp += model.getValueAt(i, j);
						temp +=",";
					}
					pw.println(temp);
				}
				pw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == btnLoad) {
			while(model.getRowCount() != 0) {
				model.removeRow(0);
			}
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String temp;
				while((temp = br.readLine()) != null) {
					String[] bookInfo = temp.split(",");
					if(bookInfo.length > 0) {
							model.addRow(bookInfo);
					}
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}
}

public class JTableEx3 {
	public static void main(String[] args) {
		new BookManager();
	}
}
