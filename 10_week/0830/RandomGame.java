package _0830;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RandomGame extends JFrame implements ActionListener{
	JButton btnRock,btnSisser,btnPaper;
	JLabel lblQuestion, lblResult, lblScore;
	
	
	RandomGame(){
		this.setSize(300,300);
		this.setDefaultCloseOperation(3);

		btnRock = new JButton("바위");
		btnSisser = new JButton("가위");
		btnPaper = new JButton("보");

		btnRock.addActionListener(this);
		btnSisser.addActionListener(this);
		btnRock.addActionListener(this);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.add(btnRock);
		pnlButtons.add(btnSisser);
		pnlButtons.add(btnPaper);
		this.add(pnlButtons,"South");
		
		lblQuestion = new JLabel();
		this.add(lblQuestion);
		
		lblResult = new JLabel();
		this.add(lblResult);
		
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int question = (int) (Math.random()*3);
//		switch(question) {
//		case 0:
//			lblResult.setText("비겼습니다");
//			break;
//		case 1:
//			lblResult.setText("이겼습니다");
//			break;
//		case 2:
//			lblResult.setText("졌습니다");
//			break;
//		}
		
		if(btnRock == e.getSource()) {
			switch(question) {
			case 0:
				lblResult.setText("비겼습니다");
				break;
			case 1:
				lblResult.setText("이겼습니다");
				break;
			case 2:
				lblResult.setText("졌습니다");
				break;
			}
		}
		else if(btnSisser == e.getSource()) {
			switch(question) {
			case 0:
				lblResult.setText("졌습니다");
				break;
			case 1:
				lblResult.setText("비겼습니다");
				break;
			case 2:
				lblResult.setText("이겼습니다");
				break;
			}
		}
		else if(btnPaper == e.getSource()) {
			switch(question) {
			case 0:
				lblResult.setText("이겼습니다");
				break;
			case 1:
				lblResult.setText("졌습니다");
				break;
			case 2:
				lblResult.setText("비겼습니다");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new RandomGame();
	}

}
