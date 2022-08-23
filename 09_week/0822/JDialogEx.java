import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogEx extends JFrame{
	public JDialogEx() {
		// TODO Auto-generated constructor stub
		this.setSize(300,300);
		this.setDefaultCloseOperation(3);
		
		// JFrame 에서 새창으로 한번 더 뜨는 JFrame
		JDialog dia = new JDialog() ;
		dia.setSize(300, 200);
		
		dia.setVisible(true);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JDialogEx();
	}
}
