
public class RectTest { // �簢���� ���� ���� Ŭ����
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setSize(10000,100); // ����100 ����100�� ũ�Ⱑ ����� ����.
		r.printSize(); // ���δ� 100 ���δ� 100 �� �簢�� �Դϴ�
		
		Rect r2 = new Rect(50000000,200000);
		r2.printSize(); // ���δ� 100 ���δ� 100 �� �簢�� �Դϴ�
	}
}
