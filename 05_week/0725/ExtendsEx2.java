import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{
	
	public ExtendsEx2() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 부모가 가지고 있던 메소드
		this.setSize(300,300); // 부모가 가지고 있던 메소드
		this.setVisible(true); // 부모가 가지고 있던 메소드
	}
	
	public void setSize(int w,int h) { // 부모가 가지고 있는것과 같은 일므의 내 메서드
		// 부모의 메서드가 마음에 안들면 똑같이 만들어서 내용을 바꾸면 된다.
		// 오버라이딩 - 내용을 바꿔버리는것
	}
	public void printSize() { // 내가 만든 메서드
		System.out.println(this.getSize());
	}
	public static void main(String[] args) {
		ExtendsEx2 ee = new ExtendsEx2();
		
		ee.printSize();
		
	}
}
