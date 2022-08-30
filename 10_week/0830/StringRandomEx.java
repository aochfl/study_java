package _0830;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StringRandomEx extends JFrame implements ActionListener{
	JPanel pnl;
	JButton btn;
	
	Color[] cols = {Color.red, Color.blue, Color.GREEN, Color.CYAN, Color.magenta};
	public StringRandomEx() {
		this.setSize(400,300);
		this.setDefaultCloseOperation(3);
		pnl = new JPanel();
		btn = new JButton("클릭");
		btn.addActionListener(this);
		
		this.add(pnl);
		this.add(btn,"South");
		
		this.setVisible(true);
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		int ran = (int) (Math.random()*cols.length);
//		pnl.setBackground(cols[ran]);

		int r = (int)(Math.random()*256);
		int g = (int)(Math.random()*256);
		int b = (int)(Math.random()*256);
		pnl.setBackground(new Color(r,g,b));
	}
	
	public static void main(String[] args) {
		new StringRandomEx();
	}
	
}
