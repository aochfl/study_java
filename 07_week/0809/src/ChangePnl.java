import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangePnl extends JFrame implements ActionListener{
	JButton btnRed,btnYellow,btnBlue;
	JPanel pnl2,pnlR,pnlY,pnlB;
	
	FileGUI3 pnlF;
	ChangeImage pnlC;
	ChangePnl(){
		this.setSize(400,330);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(0, 1));
		btnRed = new JButton();
		btnRed.setBackground(Color.RED);
		btnRed.addActionListener(this);
		pnl.add(btnRed);
		btnYellow = new JButton();
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.addActionListener(this);
		pnl.add(btnYellow);
		btnBlue = new JButton();
		btnBlue.setBackground(Color.BLUE);
		btnBlue.addActionListener(this);
		pnl.add(btnBlue);
		this.add(pnl,"West");
		
		pnl2 = new JPanel();
		pnl2.setBackground(Color.GRAY);
		pnl2.setLayout(new GridLayout());
		pnlF = new FileGUI3();
		pnlC = new ChangeImage();
//		pnlR = new JPanel();
//		pnlY = new JPanel();
		pnlB = new JPanel();
//		pnlR.setBackground(Color.RED);
//		pnlY.setBackground(Color.YELLOW);
		pnlB.setBackground(Color.BLUE);
		this.add(pnl2);
		
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRed) {
			pnl2.removeAll();
//			pnl2.add(pnlR);
			pnl2.add(pnlF);
		}
		else if (e.getSource() == btnYellow) {
			pnl2.removeAll();
//			pnl2.add(pnlY);
			pnl2.add(pnlC);
		}
		else if(e.getSource() == btnBlue) {
			pnl2.removeAll();
			pnl2.add(pnlB);
		}
//		pnl2.updateUI(); // 패널의 화면을 갱신
		
		pnl2.repaint(); // 페인팅을 새로함 / 레이아웃, 폭등등
		pnl2.revalidate(); // 레이아웃을 새로 계산하여 화면을 갱신함
	}
	
	public static void main(String[] args) {
		ChangePnl gui = new ChangePnl();
	}

}
