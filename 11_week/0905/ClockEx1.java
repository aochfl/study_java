package _0905;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockEx1 extends JFrame implements ActionListener, Runnable{
	JLabel lbl;
	JButton btnStart, btnStop;

	Thread t1;
	
	SimpleDateFormat sdf;
	boolean isRunning;
	ClockEx1(){
		this.setSize(300,200);;
		this.setDefaultCloseOperation(3);

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
		lbl = new JLabel();
		this.add(lbl);
		
		JPanel pnl = new JPanel();
		btnStart = new JButton("시작");
		btnStop = new JButton("정지");
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		pnl.add(btnStart);
		pnl.add(btnStop);
		this.add(pnl, "South");

		isRunning = false;
		t1 = new Thread(this);
		t1.start();
		
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnStart) {
			System.out.println("시작");
			isRunning = true;
		}
		else if (e.getSource() == btnStop){
			System.out.println("정지");
			isRunning = false;
		}
	}

	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			String sdate = sdf.format(date);
			lbl.setText(sdate);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(!isRunning) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ClockEx1();
	}

}
