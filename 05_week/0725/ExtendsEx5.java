class Ext5{ // class �տ� final�� ������ ���ó�� ���̻� ������ �Ұ����ϴ�.
	public void printExt5() { // ��ȯ�� �տ� final�� ������ �������̵� �Ұ�
		System.out.println("�̰��� Ex5");
	}
}
public class ExtendsEx5 extends Ext5{
	@Override
	public void printExt5() { //�������̵� - �θ��� �޼��� ������
		System.out.println("�̰��� ExtendsEx5");
	}
	
	public void printSuper() {
		super.printExt5();
	}
	
	public static void main(String[] args) {
		ExtendsEx5 ee5 = new ExtendsEx5();
		ee5.printExt5();
		
		ee5.printSuper();
	}
}
