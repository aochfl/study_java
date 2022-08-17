import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame{
	JTableEx2(){
		this.setSize(400,300);;
		this.setDefaultCloseOperation(3);
		
		String[] header = {"��ȣ","����","�۾���"};
		String[][] contents = {};
		
		// JTable���� ���� model�� header, contents�� �̿��ؼ� ����� �ش�.
		DefaultTableModel model = new DefaultTableModel(contents,header);
		
		//model�� table�� �־ ������ �ش�.
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		// �� �߰��ϱ�
		String[] rowData = new String[3];
		rowData[0] ="1";
		rowData[1] = "���";
		rowData[2] = "��ֿ���";
		model.addRow(rowData);
		
		String[] data = {"2","�޹в� �� ����","��ȿ��"};
		model.addRow(data);
		
		model.addRow(new String[] {"3","���","����"});
		
		model.removeRow(0);
		model.removeRow(0);
		
		
		this.add(sp);	
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new JTableEx2();
	}
}
