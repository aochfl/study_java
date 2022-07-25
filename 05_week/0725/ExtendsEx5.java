class Ext5{ // class 앞에 final이 붙으면 상수처럼 더이상 변경이 불가능하다.
	public void printExt5() { // 반환형 앞에 final이 붙으면 오버라이드 불가
		System.out.println("이것은 Ex5");
	}
}
public class ExtendsEx5 extends Ext5{
	@Override
	public void printExt5() { //오버라이딩 - 부모의 메서드 재정의
		System.out.println("이것은 ExtendsEx5");
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
