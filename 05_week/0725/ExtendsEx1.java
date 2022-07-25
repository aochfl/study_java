class Ext1{
	int x;
	int y;
	
	public void printExt1() {
		System.out.println(x+":"+y);
	}
}

public class ExtendsEx1 extends Ext1{
	// 내부적으로 Ext1을 가지고 있다.
	public static void main(String[] args) {
		ExtendsEx1 ee = new ExtendsEx1();
		//ee.printExt1(); // 부모의 메서드 사용
		ee.printExt1();
		
	}
	
}
