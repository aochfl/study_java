package _0905;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HorseGame extends JFrame implements ActionListener{
	JButton btnStart;
	JLabel lblTitle;
	JPanel horse1,horse2,horse3;
	
	Thread gameThread, gameTimerThread;
	int time;
	boolean isFinish;
	
	int HORSE_SIZE = 50;
	int FINISH_LINE = 280;
	HorseGame(){
		this.setSize(300,400);
		this.setDefaultCloseOperation(3);
		
		JPanel pnl = new JPanel();
		lblTitle = new JLabel();
		setTitle(0);
		pnl.add(lblTitle);
		this.add(pnl,"North");
		
		JPanel pnlGame = new JPanel();
		pnlGame.setLayout(new GridLayout(3,1));
		{
			JPanel pnlLine = new JPanel();
			pnlLine.setLayout(null);
			horse1= new JPanel();
			
			horse1.setSize(HORSE_SIZE,HORSE_SIZE);
			horse1.setLocation(0, 10);
			horse1.setBackground(Color.red);
			pnlLine.add(horse1);
			
			pnlGame.add(pnlLine);
		}
		{
			JPanel pnlLine = new JPanel();
			pnlLine.setLayout(null);
			horse2= new JPanel();
			
			horse2.setSize(HORSE_SIZE,HORSE_SIZE);
			horse2.setLocation(0, 10);
			horse2.setBackground(Color.green);
			pnlLine.add(horse2);
			
			pnlGame.add(pnlLine);
		}
		{
			JPanel pnlLine = new JPanel();
			pnlLine.setLayout(null);
			horse3= new JPanel();
			
			horse3.setSize(HORSE_SIZE,HORSE_SIZE);
			horse3.setLocation(0, 10);
			horse3.setBackground(Color.blue);
			pnlLine.add(horse3);
			
			pnlGame.add(pnlLine);
		}
		this.add(pnlGame);
		
		
		btnStart = new JButton("시작");
		btnStart.addActionListener(this);
		this.add(btnStart,"South");
		
		this.setVisible(true);
	}
	
	int isGameFinish() {
		int result = 0;
		if(horse1.getX()+HORSE_SIZE >= FINISH_LINE) {
			result = 1;
		}
		else if(horse2.getX()+HORSE_SIZE >= FINISH_LINE) {
			result = 2;
		}
		else if(horse3.getX()+HORSE_SIZE >= FINISH_LINE) {
			result = 3;
		}
		return result;
	}
	void setTitle(int time) {
		this.time = time;
		lblTitle.setText("1등이 도착까지 걸린 시간 : "+time/10+"."+time%10+"초");
	}
	void gameClear() {
		setTitle(0);
		isFinish =false;
		horse1.setLocation(0, 10);
		horse2.setLocation(0, 10);
		horse3.setLocation(0, 10);
	}
	void gameStart() {
		gameTimerThread = new Thread() {
			@Override
			public void run() {
				while(!isFinish) {
					time++;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(time);
				}
			}
		};
		gameThread = new Thread() {
			@Override
			public void run() {
				while(isGameFinish()==0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					int speed = 0;

					speed = (int) (Math.random()*20);
					horse1.setLocation(horse1.getX()+speed,horse1.getY());
					speed = (int) (Math.random()*20);
					horse2.setLocation(horse2.getX()+speed,horse2.getY());
					speed = (int) (Math.random()*20);
					horse3.setLocation(horse3.getX()+speed,horse3.getY());
					
				}
				isFinish= true;
				setTitle(time);
				JOptionPane.showMessageDialog(null, isGameFinish()+"번 말이 우승했습니다!");
			}
		};
		gameClear();
		gameTimerThread.start();
		gameThread.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnStart) {
			gameStart();
		}
	}
	

	public static void main(String[] args) {
		new HorseGame();
	}
}
