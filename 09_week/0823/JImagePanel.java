import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class JImagePanel extends JPanel{
	ImageIcon icon;
	public JImagePanel(ImageIcon icon) {
		this.icon = icon;
	}
	public JImagePanel(ImageIcon icon, LayoutManager manager) {
		this.icon = icon;
		this.setLayout(manager);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		this.setOpaque(false);
		g.drawImage(icon.getImage(), 0, 0, null);
		super.paintComponent(g);
	}
}
