package _0905;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BoxGame1 extends JFrame implements ActionListener{
	JPanel pnl;
	JButton btnStart;
	JButton[] btns;
	Thread t;
	
	// 지워야 되는 버튼 번호
	int btnNum=0;
	
	public BoxGame1() {
		this.setSize(500,400);
		this.setDefaultCloseOperation(3);
		btnStart = new JButton("시작");
		btnStart.addActionListener(this);
		btns= new JButton[10];
		pnl = new JPanel();
		pnl.setLayout(null);
		
		this.add(pnl);
		this.add(btnStart,"South");
		this.setVisible(true);
	}
	
	void threadRun() {
		t = new Thread() {			
			@Override
			public void run() {// 작업
				// 이하 10번 반복				
				// 랜덤 버튼 만들기-배열 이용
				// 랜덤 크기 설정
				// 랜덤 색상 설정
				// 랜덤 위치 설정
				// pnl에 붙이기
				
				// 초기화 
				pnl.removeAll();
				
				for(int i=0;i<10;i++) {
					btns[i] = new JButton(i+"");
					//Math.random() * 최대값(+최소값) + 최소값
					int w = (int)(Math.random()*70)+40;//11 ~ 20
					int h = (int)(Math.random()*70)+40;//11 ~ 20
					btns[i].setSize(w, h);
					int r = (int)(Math.random()*256);//0~255
					int g = (int)(Math.random()*256);//0~255 
					int b = (int)(Math.random()*256);//0~255 
					btns[i].setBackground(new Color(r,g,b));
					int x = (int)(Math.random()*380);
					int y = (int)(Math.random()*280);
					btns[i].setLocation(x, y);
					
					btns[i].addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							JButton btna = (JButton) e.getSource();
							System.out.println(btna.getText()); 
							//현재내가 누른 버튼 == btna
							
							if(btna.getText().equals(btnNum+"")) {
								pnl.remove(btna);
								pnl.updateUI();								
								btnNum++;
								if(pnl.getComponentCount()==0) {
									JOptionPane.showMessageDialog(pnl, "끝");
								}
							}
							
						}
					});
					
					// 버튼 눌렀을때 0부터 순서대로 클릭하면 사라지게
					
					pnl.add(btns[i]);
					pnl.repaint();
					pnl.revalidate();
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
		};
		t.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnStart) {
			btnNum=0;
			threadRun();
		}
	} 
	
	public static void main(String[] args) {
		new BoxGame1();
	}

}











