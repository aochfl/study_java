class Static{
	static int i; // static 정적 - 이 값은 무조건 1개만 만들어 집니다.
	int j; // 이 클래스로 생성된 모든 인스턴스는 static 값을 공유한다
}
public class StaticEx {
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.i++;
		s1.j++;
		System.out.println(s1.i + ":" + s1.j);

		Static s2 = new Static();
		s2.i++;
		s2.j++;
		System.out.println(s2.i + ":" + s2.j);
	}
}
