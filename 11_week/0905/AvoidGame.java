package _0905;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class Box extends JPanel{
	int speed;
	int size;
	int x;
	int y;
	int end_y;
	Box(int speed,int size, int start_x, int end_y){
		super();
		
		this.speed = speed;
		this.size = size;
		this.x = start_x;
		this.y = 0;
		this.end_y = end_y;
		
		this.setSize(size,size);
		this.setBackground(Color.red);
		this.setLocation(x,y);
	}
	boolean finish() {
		boolean result = false; 
		
		if(this.getY()+size >=end_y)
			result = true;
		
		return result;
		
	}
	public void moving() {
		this.setLocation(x,this.getY()+this.speed);
	}
}

public class AvoidGame extends JFrame implements ActionListener{
	JButton btnStart;
	JButton btnL,btnR;
	
	JPanel pnlBall;
	
	JPanel pnlGameBoard;
	ArrayList<Box> boxList;
	
	int time;
	
	Thread gameThread, gameTimeThread;
	boolean gameFinish;
	int GAME_WIDTH = 400;
	int GAME_HEIGHT = 400;
	int GAME_TICK = 250;
	int BOX_MAX_COUNT = 99;
	int BOX_SIZE = 30;
	int BOX_COUNT_TICK = 3;
	boolean isCreateBox = false;
	AvoidGame(){
		this.setSize(400,500);
		this.setDefaultCloseOperation(3);
		
		gameFinish = true;
		
		btnStart = new JButton("시작");
		btnStart.addActionListener(this);
		this.add(btnStart,"North");
		
		boxList = new ArrayList();
		
		pnlGameBoard = new JPanel();
		pnlGameBoard.setBackground(Color.white);
		pnlGameBoard.setLayout(null);
		this.add(pnlGameBoard,"Center");
		
		pnlBall = new JPanel();
		pnlBall.setBackground(Color.blue);
		pnlBall.setSize(BOX_SIZE,BOX_SIZE);
		pnlBall.setLocation(GAME_WIDTH/2, GAME_HEIGHT-BOX_SIZE);
		pnlGameBoard.add(pnlBall);
		
		JPanel pnlBtnBoard = new JPanel();
		pnlBtnBoard.setLayout(new GridLayout(0,2));
		btnL = new JButton("<<<<<");
		btnR = new JButton(">>>>>");
		btnL.addActionListener(this);
		btnR.addActionListener(this);
		pnlBtnBoard.add(btnL);
		pnlBtnBoard.add(btnR);
		this.add(pnlBtnBoard,"South");
		
		
		this.setVisible(true);
	}
	
	boolean isGameFinished() {
		boolean result = false;
		
		
		return result;
	}
	
	void startGame() {
		gameTimeThread = new Thread() {
			@Override
			public void run() {
				while(!gameFinish) {
					if(time%BOX_COUNT_TICK == 0 && isCreateBox)
						isCreateBox = false;
					time++;
					try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
		};
		gameThread = new Thread() {
			@Override
			public void run() {
				while(!(gameFinish = isGameFinished())) {
					try { Thread.sleep(GAME_TICK); } catch (InterruptedException e) { e.printStackTrace(); }
					if(!isCreateBox) {
						isCreateBox = true;
						int speed = (int)(Math.random() * 20)+1;
						int x = (int)(Math.random()*(GAME_WIDTH-BOX_SIZE))+BOX_SIZE;
						Box box = new Box(speed,BOX_SIZE,x,GAME_HEIGHT);
						pnlGameBoard.add(box);
						
						boxList.add(box);
					}
					for(int i = 0 ; i < boxList.size() ; i++) {
						if(boxList.get(i).finish()) {
							pnlGameBoard.remove(boxList.get(i));
							boxList.remove(i);
						}
						else {
							boxList.get(i).moving();
						}
					}

					pnlGameBoard.repaint();
				}
				JOptionPane.showMessageDialog(null, time+"초 생존하셨습니다 !");
			}
		};
		gameFinish = false;
		time = 0;
		gameTimeThread.start();
		gameThread.start();
	}
	void moveBall(boolean isLeft,int range) {
		int move = isLeft? range*-1 : range;
		int position = pnlBall.getX()+move;
		if(position < 0 ) position = 0;
		else if (position >= GAME_WIDTH- BOX_SIZE) position = GAME_WIDTH - BOX_SIZE;
		pnlBall.setLocation(position, pnlBall.getY());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnStart) {
			if(gameFinish)  startGame();
		}
		else if(e.getSource()== btnL) {
			moveBall(true,BOX_SIZE);
		}
		else if(e.getSource()== btnR) {
			moveBall(false,BOX_SIZE);
		}
	}

	public static void main(String[] args) {
		new AvoidGame();
	}
}
