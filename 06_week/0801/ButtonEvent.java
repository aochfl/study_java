import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 메인은 실행하는 순서를 쓰는곳
		frame.setLayout(new FlowLayout());
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		frame.add(btn1);
		frame.add(btn2);
		
		// 인터페이스를 생성하려면 생성과 동시에 내용을 작성해야한다.
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn1){
					System.out.println("버튼1");
				}else if (e.getSource()==btn2) {
					System.out.println("버튼2");
				}
			}
		};
		btn1.addActionListener(listener);
		btn2	.addActionListener(listener);
		
		
		
		
		
		
		
		frame.setVisible(true);
	}
}
