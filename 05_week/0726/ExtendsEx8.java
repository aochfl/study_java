class Ext8Parent{
	int x;
	public void printExt8Parent(){
		System.out.println("�θ�Ŭ����"+x);
		x++;
	}
}
class Ext8Child extends Ext8Parent{
	int y;
	public void printExt8Child() {
		System.out.println("�ڽ�Ŭ����"+y);
		y++;
	}
}
public class ExtendsEx8 {
	public static void main(String[] args) {
		Ext8Parent p = new Ext8Child();
		p.printExt8Parent();
		// p.printExt8Child // ��� ������ �ڽ�Ŭ������ ���������
							// �θ� Ŭ������ �ٲ���� ������ �ڽ�Ŭ������ �޼ҵ�� ȣ��Ұ�
		// Ext8Child c = new Ext8Parent(); // �θ� �����ؼ� �ڽĿ��� ����ؾ���
		Ext8Child c = (Ext8Child) p;
		c.printExt8Parent();
		c.printExt8Child();
	}
}
