package _0830;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 이번달의 마지막 가져오기
// 이번달의 첫날 가져오기


public class CalendarEx extends JFrame implements ActionListener{

	String[] week = {"일","월","화","수","목","금","토"};

	Font fontTitle = new Font("나눔 고딕", Font.PLAIN, 15);
	JPanel pnlCalendar;
	JButton btnPrev, btnNext;
	JLabel lblMonth;
	
	Calendar showDate;
	public CalendarEx() {
		this.setSize(400,400);
		this.setDefaultCloseOperation(3);
		
		JPanel pnlUpper = new JPanel();
		pnlUpper.add(btnPrev=new JButton("<"));
		pnlUpper.add(lblMonth = new JLabel());
		pnlUpper.add(btnNext=new JButton(">"));
		btnPrev.addActionListener(this);
		btnNext.addActionListener(this);
		this.add(pnlUpper,"North");
		
		pnlCalendar = new JPanel();
		pnlCalendar.setLayout(new GridLayout(0, 7));
		this.add(pnlCalendar);
		
		showDate = Calendar.getInstance();
		setCalendar(showDate);
		
		this.setVisible(true);
	}
	
	public void setCalendar(Calendar date) {
		pnlCalendar.removeAll();

		// 필요한 날짜 계산 - 마지막 날짜, 시작요일
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		int lastDate = date.get(Calendar.DAY_OF_WEEK);
		date.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH),1);
		int startDate = date.get(Calendar.DAY_OF_WEEK);
		
		// 현재 달 세팅
		lblMonth.setText(date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월");
		
		// 일~토 버튼 세팅
		for (String string : week) {
			JButton btn = new JButton(string);
			btn.setBackground(Color.GRAY);
			btn.setFont(fontTitle);
			btn.setForeground(new Color(255,255,255));
			pnlCalendar.add(btn);
		}
		

		// 시작날짜 전까지 빈 button 추가
		for(int i = 1; i < startDate ; i++) {
			JButton btn = new JButton();
			btn.setBackground(Color.WHITE);
			btn.setEnabled(false);
			pnlCalendar.add(btn);
		}
		
		// 시작날짜부터 마지막 날짜까지 버튼 추가
		for(int i = 1; i <= lastDay ; i++) pnlCalendar.add(new JButton(i+""));

		// 마지막날짜부터 그 주의 끝까지 빈 버튼 추가
//		for(int i = lastDate+1; i < 7 ; i++) {
//			JButton btn = new JButton();
//			btn.setBackground(Color.WHITE);
//			btn.setEnabled(false);
//			pnlCalendar.add(btn);
//		}
		this.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnPrev) {
			showDate.add(Calendar.MONTH,-1);
			setCalendar(showDate);
		}
		else if(e.getSource()== btnNext) {
			showDate.add(Calendar.MONTH,+1);
			setCalendar(showDate);
		}
		
	}
	public static void main(String[] args) {
		new CalendarEx();
	}

}
