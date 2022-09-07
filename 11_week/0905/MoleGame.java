package _0905;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MoleGame extends JFrame implements ActionListener{
	JLabel lblTime, lblScore;
	JButton[] btns;
	JButton btnStart;
	JPanel pnlNorth,pnlCenter;
	Thread t,t2;
	int time = 20;
	int score = 0;
	boolean isRunning = false;
	
	public MoleGame() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(3);
		lblTime = new JLabel(time+"");
		lblScore = new JLabel("점수 : "+score);
		pnlNorth = new JPanel(new GridLayout(0,2));
		pnlNorth.add(lblTime);
		pnlNorth.add(lblScore);
		
		pnlCenter = new JPanel(new GridLayout(0, 3));
		btns = new JButton[9];
		for(int i=0;i<btns.length;i++) {
			btns[i] = new JButton(new ImageIcon("img/0.png"));
			btns[i].addActionListener(this);
			pnlCenter.add(btns[i]);
		}
		
		btnStart = new JButton("시작");
		btnStart.addActionListener(this);
		
		this.add(pnlNorth,"North");
		this.add(pnlCenter);
		this.add(btnStart,"South");
		this.setVisible(true);
	}
	
	void init() {
		for(int i=0;i<btns.length;i++) {
			btns[i].setIcon(new ImageIcon("img/0.png","off"));
		}
	}
	
	void threadRun() {
		t = new Thread() {			
			@Override
			public void run() {// 작업
				while(isRunning) {										
					time--;
					lblTime.setText(time+"");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(time==0) {
						break;
					}
				}
				JOptionPane.showMessageDialog(pnlCenter, "총 점수:"+score);
				time=20;
				score=0;
				lblTime.setText(time+"");
				lblScore.setText("점수 : "+score);
				btnStart.setEnabled(true);
				isRunning=false;
			}			
		};
		t.start();
	}
	void threadRun2() {
		t2 = new Thread() {			
			@Override
			public void run() {// 작업
				while(isRunning) {
					init();					
					int ran = (int)(Math.random()*btns.length);
					btns[ran].setIcon(new ImageIcon("img/4.png","on"));					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(time==0) {
						break;
					}
				}
			}			
		};
		t2.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn==btnStart) {
			isRunning=true;			
			threadRun();
			threadRun2();
			btnStart.setEnabled(false);
		}else {
			ImageIcon icon = (ImageIcon) btn.getIcon();
			if(icon.getDescription().equals("on")) {
				score+=10;				
				btn.setIcon(new ImageIcon("img/0.png"));
			}else {
				score-=10;				
			}
			lblScore.setText("점수 : "+score);
		}
	}
	
	public static void main(String[] args) {
		new MoleGame();
	}
}
