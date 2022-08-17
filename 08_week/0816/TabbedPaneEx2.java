import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

class First extends JPanel{
	JButton btnNorth, btnSouth, btnEast, btnWest, btnCenter;
	First(){
		this.setLayout(new BorderLayout());
		btnNorth = new JButton("North");
		btnSouth = new JButton("South");
		btnEast = new JButton("East");
		btnWest = new JButton("West");
		btnCenter = new JButton("Center");

		this.add(btnNorth,"North");
		this.add(btnSouth,"South");
		this.add(btnEast,"East");
		this.add(btnWest,"West");
		this.add(btnCenter,"Center");
	}
}

class Second extends JPanel{
	public Second() {
		this.setLayout(new FlowLayout());

		this.add(new JButton("btn1"));
		this.add(new JButton("btn2"));
		this.add(new JButton("btn3"));
	}
}

class Third extends JPanel{
	public Third() {
		this.setLayout(new GridLayout(3, 3,5,5));
		
		for(int i = 0; i < 9 ; i++) {
			this.add(new JButton("btn"+(i+1)));
		}
	}
}

class Fourth extends JPanel{
	public Fourth() {
		this.setLayout(new BorderLayout());
		JTextArea ta = new JTextArea();
		JScrollPane pa = new JScrollPane(ta);
		this.add(pa,"Center");
	}
}

public class TabbedPaneEx2 extends JFrame{
	public TabbedPaneEx2() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tab;
		
		tab = new JTabbedPane();
		tab.add("border",new First());
		tab.add("flow",new Second());
		tab.add("grid",new Third());
		tab.add("Scroll",new Fourth());
		this.add(tab);
		
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		TabbedPaneEx2 ex2 = new TabbedPaneEx2();
	}
}
