import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorDialog extends JDialog implements ActionListener{
	JButton btnRed, btnGreen, btnBlue, btnClose;
	JPanel parentsPnl;
	public ColorDialog() {
		this.setSize(200,200);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		btnRed = new JButton();
		btnRed.setBackground(Color.RED);
		btnRed.addActionListener(this);
		btnGreen = new JButton();
		btnGreen.setBackground(Color.GREEN);
		btnGreen.addActionListener(this);
		btnBlue = new JButton();
		btnBlue.setBackground(Color.BLUE);
		btnBlue.addActionListener(this);
		btnClose = new JButton("닫기");
		btnClose.addActionListener(this);
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(0,3));
		pnl.add(btnRed);
		pnl.add(btnGreen);
		pnl.add(btnBlue);
		this.add(pnl);
		this.add(btnClose,"South");
		
		this.setVisible(true);
	}
	public void setPanel(JPanel pnl) {
		this.parentsPnl = pnl;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRed) {
			parentsPnl.setBackground(btnRed.getBackground());
		}
		else if(e.getSource()==btnGreen) {
			parentsPnl.setBackground(btnGreen.getBackground());
		}
		else if(e.getSource()==btnBlue) {
			parentsPnl.setBackground(btnBlue.getBackground());
		}
		
		this.dispose();
	}
	
}


public class SubDialogPractice extends JFrame implements ActionListener{
	JPanel pnl;
	JButton btn;
	ColorDialog dia;
	
	public SubDialogPractice() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(3);
		
		pnl = new JPanel();
		btn = new JButton("색변경");
		btn.addActionListener(this);
		this.add(pnl);
		this.add(btn,"South");

		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dia = new ColorDialog();
		dia.setPanel(pnl);
	}
	
	public static void main(String[] args) {
		new SubDialogPractice();
	}
}
