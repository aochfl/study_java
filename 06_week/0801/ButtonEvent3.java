import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent3 extends JFrame implements ActionListener{
	JButton btn_red, btn_blue, btn_green;
	
	public ButtonEvent3() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		btn_red = new JButton("»¡°­");
		btn_red.setBackground(Color.red);
		btn_red.addActionListener(this);
		btn_blue = new JButton("ÆÄ¶û");
		btn_blue.setBackground(Color.blue);
		btn_blue.addActionListener(this);
		btn_green = new JButton("ÃÊ·Ï");
		btn_green.setBackground(Color.green);
		btn_green.addActionListener(this);
		
		this.add(btn_red);
		this.add(btn_blue);
		this.add(btn_green);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(	e.getSource() == btn_red) {
			System.out.println("red");
			this.getContentPane().setBackground(Color.red);
		}
		else if( e.getSource() == btn_blue) {
			System.out.println("blue");
			this.getContentPane().setBackground(Color.blue);
		}
		else if(e.getSource() == btn_green) {
			System.out.println("green");
			this.getContentPane().setBackground(Color.green);
		}
	}


	public static void main(String[] args) {
		ButtonEvent3 btEvent = new ButtonEvent3();
	}
}
