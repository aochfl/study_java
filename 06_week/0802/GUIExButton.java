import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIExButton extends HFrame implements ActionListener, ItemListener{
	JTextField tf;
	JLabel lbl;
	JPanel p;
	JButton btn;
	JRadioButton ck1, ck2, ck3;
	Color color;
	public GUIExButton() {
		tf = new JPasswordField();
		lbl= new JLabel("여기에 글씨가 TextFiled에 있는 글자로 바귑니다");
		p = new JPanel();
		p.setLayout(new FlowLayout());
		btn = new JButton("클릭");
		btn.addActionListener(this);
		ck1 = new JRadioButton("빨강");
		ck1.addItemListener(this);
		ck2 = new JRadioButton("파랑");
		ck2.addItemListener(this);
		ck3 = new JRadioButton("없음");
		ck3.addItemListener(this);
		ButtonGroup group = new ButtonGroup();
		group.add(ck1);
		group.add(ck2);
		group.add(ck3);
		this.add(tf,"North");
		p.add(lbl);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		this.add(p);
		this.add(btn,"South");
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUIExButton();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			lbl.setForeground(color);
			lbl.setText(tf.getText());
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(ck1.isSelected()) {
			color = Color.RED;
		}
		else if(ck2.isSelected()) {
			color = Color.BLUE;
		}
		else if(ck3.isSelected()) {
			color = Color.BLACK;
		}
	}
}
