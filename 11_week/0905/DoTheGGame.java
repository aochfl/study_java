package _0905;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class DoTheGGame extends JFrame implements ActionListener{
	JLabel lblTime, lblScore;
	JButton[] btns;
	JButton btnStart;

	Thread gameThread, gameTimerThread;
	int score, time;
	
	int GAME_TIME = 5;
	DoTheGGame(){
		this.setSize(300,400);
		this.setDefaultCloseOperation(3);
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(0,2));
		pnl.add(lblTime = new JLabel("시간 : "),"West");
		pnl.add(lblScore = new JLabel("점수 : "),"Center");
		this.add(pnl,"North");
		
		JPanel pnlGame = new JPanel();
		pnlGame.setLayout(new GridLayout(0,3));
		btns = new JButton[9];
		for(int i = 0 ; i < btns.length ;i++) {
			btns[i] = new JButton();
			btns[i].setVisible(false);
			btns[i].addActionListener(this);
			btns[i].setBackground(Color.RED);
			pnlGame.add(btns[i]);
		}
		this.add(pnlGame);
		
		
		btnStart = new JButton("시작");
		btnStart.addActionListener(this);
		this.add(btnStart,"South");
		
		this.setVisible(true);
	}
	void setScore(int score) {
		this.score = score;
		lblScore.setText("점수 : "+score);
	}
	void setTime(int time) {
		this.time = time;
		lblTime.setText("시간 : "+time);
	}
	void gameStart() {
		gameTimerThread = new Thread() {
			@Override
			public void run() {
				setTime(GAME_TIME);
				while(time != 0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					setTime(--time);
				}
				
			}
		};
		gameThread = new Thread() {			
			@Override
			public void run() {
				while(time !=0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					int num = (int)(Math.random()*9);
					btns[num].setVisible(true);
				}
				for(int i = 0 ; i < btns.length ;i++) {
					btns[i].setVisible(false);
				}
				JOptionPane.showMessageDialog(null, "게임이 종료되었습니다\n획득점수는 "+score+"점 입니다.");
			}
		};

		setScore(0);
		gameTimerThread.start();
		gameThread.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnStart) {
			if(time == 0 ) {
				gameStart();
			}
			else {
				JOptionPane.showMessageDialog(null, "게임이 이미 진행중입니다");
			}
		}
		else {
			JButton btn = (JButton) e.getSource();
			btn.setVisible(false);
			setScore(++score);
		}
		
	}
	

	public static void main(String[] args) {
		new DoTheGGame();
	}
}
