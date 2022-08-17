import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame{
	JTableEx2(){
		this.setSize(400,300);;
		this.setDefaultCloseOperation(3);
		
		String[] header = {"번호","제목","글쓴이"};
		String[][] contents = {};
		
		// JTable보다 먼저 model을 header, contents를 이용해서 만들어 준다.
		DefaultTableModel model = new DefaultTableModel(contents,header);
		
		//model을 table에 넣어서 생성해 준다.
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		// 값 추가하기
		String[] rowData = new String[3];
		rowData[0] ="1";
		rowData[1] = "백경";
		rowData[2] = "헤밍웨어";
		model.addRow(rowData);
		
		String[] data = {"2","메밀꽃 필 무렵","이효석"};
		model.addRow(data);
		
		model.addRow(new String[] {"3","삼대","염상섭"});
		
		model.removeRow(0);
		model.removeRow(0);
		
		
		this.add(sp);	
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new JTableEx2();
	}
}
