class Ext8Parent{
	int x;
	public void printExt8Parent(){
		System.out.println("부모클래스"+x);
		x++;
	}
}
class Ext8Child extends Ext8Parent{
	int y;
	public void printExt8Child() {
		System.out.println("자식클래스"+y);
		y++;
	}
}
public class ExtendsEx8 {
	public static void main(String[] args) {
		Ext8Parent p = new Ext8Child();
		p.printExt8Parent();
		// p.printExt8Child // 비록 만들기는 자식클래스로 만들었지만
							// 부모 클래스로 바뀌었기 때문에 자식클래스의 메소드는 호출불가
		// Ext8Child c = new Ext8Parent(); // 부모를 생성해서 자식에계 상속해야함
		Ext8Child c = (Ext8Child) p;
		c.printExt8Parent();
		c.printExt8Child();
	}
}
