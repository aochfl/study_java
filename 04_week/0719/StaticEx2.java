
public class StaticEx2 {
	public static void main(String[] args) {
		
		// 변하지 않는 자주 쓰는 변수나 메서드를 주로 정적처리하여 사용한다.
		System.out.println(Math.PI);
		System.out.print(Math.random());
		
		System.out.println(Static.i); // 정적변수 : 클래스명.변수로 접근가능
		
		Static s = new Static();
		System.out.println(s.j);
	}
}
