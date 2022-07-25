import java.awt.Color;


public class GUIEx8{
	public GUIEx8() {
		MFrame m = new MFrame(500,400);
		CPanel pnl = new CPanel(Color.red); // 색상패널을 만들고 싶으면 ex)new CPanel(Color.RED)
//		
		m.add(pnl);
		m.setVisible(true);
	}
	
	public static void main(String[] args) {
		GUIEx8 ge8 = new GUIEx8();
	}
}
