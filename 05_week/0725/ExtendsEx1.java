class Ext1{
	int x;
	int y;
	
	public void printExt1() {
		System.out.println(x+":"+y);
	}
}

public class ExtendsEx1 extends Ext1{
	// ���������� Ext1�� ������ �ִ�.
	public static void main(String[] args) {
		ExtendsEx1 ee = new ExtendsEx1();
		//ee.printExt1(); // �θ��� �޼��� ���
		ee.printExt1();
		
	}
	
}
