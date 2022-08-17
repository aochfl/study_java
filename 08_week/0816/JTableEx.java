import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx extends JFrame{
	public JTableEx() {
		this.setSize(400,300);
		this.setDefaultCloseOperation(3);
		
		Calendar calendar = Calendar.getInstance();
		// ��¥�� �⺻������ ��� �ý��ۿ��� �����Ѵ�.�� ��¥�� ��� pc�� �ð��� ���� �׷��Ƿ� ������ �ƴ� �̹� �����Ȱ� �����ؼ� ����

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day1 = sdf.format(calendar.getTime());
		// calendar ���� ���� ��¥+�ð��� �����ͼ� format�� ��翡 �°� ���

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		String day2 = sdf2.format(calendar.getTime());

		SimpleDateFormat sdf3 = new SimpleDateFormat("MM�� dd��");
		String day3 = sdf3.format(calendar.getTime());
		

		//jtable�� �����϶��� �׳� ���, �������϶� modal �̿�
		String[]header = {"��ȣ", "ü��", "��¥"};
		String[][] contents = {
				{"1","���ΰ� �ٴ�",day1},
				{"2","���������", day2},
				{"3","�ҳ��̿´�",day3},
				{"4","������ʹ���",day3}};
		
		JTable table = new JTable(contents, header);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
		
		System.out.println(table.getValueAt(1, 1));
		table.setValueAt("�ް�6�潺", 2, 1);

		System.out.println(table.getRowCount());
		System.out.println(table.getColumnCount());
		System.out.println(table.getColumnName(0));
		
		
		this.setLocationRelativeTo(null); // ����� ȭ���� ��� ����
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		JTableEx ex = new JTableEx();
	}
}
