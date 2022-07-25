import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class GUIEx7 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,500);
		f.setLayout(new FlowLayout(5));
		
		
		JPanel titlePanel = new JPanel();
		JLabel l = new JLabel("ȸ������");
		titlePanel.add(l);
		f.add(titlePanel);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(0,2));
		//p.setSize(300, 400);

		infoPanel.add(new JLabel("���̵�"));
		JTextField idText = new JTextField();
		infoPanel.add(idText);

		infoPanel.add(new JLabel("�̸�"));
		JTextField nameText = new JTextField();
		infoPanel.add(nameText);

		infoPanel.add(new JLabel("��й�ȣ"));
		JTextField passwdText = new JTextField();
		infoPanel.add(passwdText);

		infoPanel.add(new JLabel("����ó"));
		JTextField phoneText = new JTextField();
		infoPanel.add(phoneText);

		infoPanel.add(new JLabel("����"));
		JRadioButton manBtn = new JRadioButton("����");
		JRadioButton womanBtn = new JRadioButton("����");
		ButtonGroup bg = new ButtonGroup();
		bg.add(manBtn);
		bg.add(womanBtn);
		JPanel sexPanel = new JPanel();
		sexPanel.add(manBtn);
		sexPanel.add(womanBtn);
		infoPanel.add(sexPanel);

		infoPanel.add(new JLabel("���"));
		JCheckBox swimBtn = new JCheckBox("����");
		JCheckBox readBtn = new JCheckBox("����");
		JCheckBox musicBtn = new JCheckBox("����");
		JPanel hobbyPanel = new JPanel();
		hobbyPanel.add(swimBtn);
		hobbyPanel.add(readBtn);
		hobbyPanel.add(musicBtn);
		infoPanel.add(hobbyPanel);
		
		f.add(infoPanel);
		
		
		JPanel btnPanel = new JPanel();
		JButton btn1 = new JButton("����");
		JButton btn2 = new JButton("���");
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		f.add(btnPanel);
		
		f.setVisible(true);
		
	}
}
