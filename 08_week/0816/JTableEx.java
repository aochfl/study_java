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
		// 날짜는 기본적으로 모든 시스템에서 공유한다.이 날짜는 모든 pc의 시간과 같다 그러므로 생성이 아닌 이미 생성된걸 공유해서 쓴다

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day1 = sdf.format(calendar.getTime());
		// calendar 에서 오늘 날짜+시간을 가져와서 format에 모양에 맞게 출력

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		String day2 = sdf2.format(calendar.getTime());

		SimpleDateFormat sdf3 = new SimpleDateFormat("MM월 dd일");
		String day3 = sdf3.format(calendar.getTime());
		

		//jtable도 고정일때는 그냥 사용, 유동적일땐 modal 이용
		String[]header = {"번호", "체득", "날짜"};
		String[][] contents = {
				{"1","노인과 바다",day1},
				{"2","레미제라블", day2},
				{"3","소년이온다",day3},
				{"4","동백꽃필무렵",day3}};
		
		JTable table = new JTable(contents, header);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
		
		System.out.println(table.getValueAt(1, 1));
		table.setValueAt("달과6펜스", 2, 1);

		System.out.println(table.getRowCount());
		System.out.println(table.getColumnCount());
		System.out.println(table.getColumnName(0));
		
		
		this.setLocationRelativeTo(null); // 실행시 화면이 가운데 나옴
		this.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		JTableEx ex = new JTableEx();
	}
}
