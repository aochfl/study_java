
public class MethodEx2 { // x�� Ŭ��������, �޼��嵵 Ŭ���� �Ҽ��̴�.
	int x;
	
	void plus() { // void �� ���� �޼���� �޼��� ��ü�� ����Ǹ鼭 ��.
		System.out.println(x+10);
	}
	
	void plus(int y) { // �����ε� - �Ű������� ����, Ÿ��, ������ ���� �̸��� ������ �ٸ� �޼���
		 System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		MethodEx2 me = new MethodEx2();
		me.plus();
		
		me.x = 10;
		me.plus();
		
		me.plus(50);
		
	}
}
