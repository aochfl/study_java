import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{
	
	public ExtendsEx2() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �θ� ������ �ִ� �޼ҵ�
		this.setSize(300,300); // �θ� ������ �ִ� �޼ҵ�
		this.setVisible(true); // �θ� ������ �ִ� �޼ҵ�
	}
	
	public void setSize(int w,int h) { // �θ� ������ �ִ°Ͱ� ���� �Ϲ��� �� �޼���
		// �θ��� �޼��尡 ������ �ȵ�� �Ȱ��� ���� ������ �ٲٸ� �ȴ�.
		// �������̵� - ������ �ٲ�����°�
	}
	public void printSize() { // ���� ���� �޼���
		System.out.println(this.getSize());
	}
	public static void main(String[] args) {
		ExtendsEx2 ee = new ExtendsEx2();
		
		ee.printSize();
		
	}
}
