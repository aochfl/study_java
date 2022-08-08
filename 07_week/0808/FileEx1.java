import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class MFrame extends JFrame implements ActionListener{
	JTextField tf ;
	JTextArea ta;
	JButton btnSave;
	JButton btnOpen;

	File file;
	
	FileWriter fw;
	PrintWriter pw;
	
	FileReader fr;
	BufferedReader br; // 한줄씩 읽어올수있음
	MFrame(){
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		
		tf = new JTextField();
		this.add(tf,"North");

		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		ta.setBackground(Color.white);
		this.add(sp,"Center");
		
		JPanel pnl = new JPanel();
		btnSave = new JButton("저장하기");
		btnOpen = new JButton("불러오기");
		btnSave.addActionListener(this);
		btnOpen.addActionListener(this);
		pnl.add(btnSave);
		pnl.add(btnOpen);
		this.add(pnl,"South");
		
		this.setVisible(true);
		tf.setText("test1.txt");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( btnSave == e.getSource()  ) {
			file = new File(tf.getText());
			
			try { // try 사이에 예외가 발생할 수도 있는 내용을 작성
				fw = new FileWriter(file);
				pw = new PrintWriter(fw);

				pw.println(ta.getText());
				
				pw.flush();
				fw.flush(); // 버퍼에 있는 내용 다 꺼내기
				fw.close();
				pw.close();
				
			}catch(IOException e1) { // 발생할 수 있는 예외를 써줌
				// 예외가 발생했을 경우 작동될 내용을 써줌
				System.out.println("예외발생");
				e1.printStackTrace();
			}
		}else if(btnOpen == e.getSource()  ){
			file = new File(tf.getText());
			ta.setText("");
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr); // 한줄단위로 읽어짐
				String line = null; // 메서드 내에서 만든 변수는 반드시 초기값이 있어야함
				
				while((line=br.readLine())!= null){
					line = br.readLine();
					ta.append(line+"\n");
					System.out.println(line);
				}
				
				fr.close();
				br.close();
			}catch(FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}

public class FileEx1 {
	public static void main(String[] args) {
		MFrame frm = new MFrame();
	}
}
