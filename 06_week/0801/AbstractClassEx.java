abstract class Animal{
	public void moving() {
		System.out.println("�����δ�");
	}
	public abstract void sound(); // �߻� �޼���
	// ������ �����δٴ� ����� �� ������ �ְ�, �Ҹ��� �� ������ ������
	// �Ҹ��� �� �ٸ��Ƿ� �� Ŭ������ ����ϸ� sound() Ŭ������ ������ ���� ����ؾ���
}
public class AbstractClassEx {
	
	
	public static void main(String[] args) {
		Animal ani = new Animal() {
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("��");
			}
		};
		ani.moving(); // �Ϲݸ޼���
		ani.sound(); // �߻�޼���
		// ���� �ϼ����������
	}
}
