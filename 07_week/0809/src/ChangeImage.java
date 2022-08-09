import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChangeImage extends JPanel implements ActionListener
{
	JButton btnApple,btnSnoopy,btnSea;
	JLabel jLabel;
	ChangeImage(){
		this.setLayout(new BorderLayout());
		JPanel pnl = new JPanel();
		btnApple = new JButton("사과");
		btnSnoopy = new JButton("스누피");
		btnSea = new JButton("바다");
		btnApple.addActionListener(this);
		btnSnoopy.addActionListener(this);
		btnSea.addActionListener(this);
		pnl.add(btnApple);
		pnl.add(btnSnoopy);
		pnl.add(btnSea);
		
		this.add(pnl,"North");
		
		JPanel pnlImage = new JPanel();
		pnlImage.setLayout(new BorderLayout());

		jLabel = new JLabel();
		jLabel.setHorizontalAlignment(JLabel.CENTER);
		pnlImage.add(jLabel);
		
	
		this.add(pnlImage ,"Center");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnApple) {
			jLabel.setIcon(new ImageIcon("apple.jpg"));
		}
		else if (e.getSource()==btnSnoopy) {
			jLabel.setIcon(new ImageIcon("snoopy.png"));
		}
		else if(e.getSource()==btnSea) {
			jLabel.setIcon(new ImageIcon("sea.jpg"));
		}

		this.repaint(); // 페인팅을 새로함 / 레이아웃, 폭등등
		this.revalidate(); // 레이아웃을 새로 계산하여 화면을 갱신함
	}
	
	
	public static void main(String[] args) {
		JFrame frm = new JFrame();
		frm.setSize(500, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ChangeImage ci = new ChangeImage();

		frm.add(ci);
		
		frm.setVisible(true);
	}
}
