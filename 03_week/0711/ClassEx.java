
public class ClassEx {
	int k ; // 전역변수는 값을 넣지 않으면 알아서 초기화된다.
	double d;
	boolean b;
	String str;
	
	public static void main(String[] args) {
		
		// 클래스 소속 변수는 그냥 사용이 안된다. 반드시 메모리에 올려서 사용을 해야한다. => 메모리에 new를 통해 올려야한다.
		// System.out.println(k);
		// System.out.println(str);
		
		String str = "헬로";
		// 문자열타입 변수 = 문자열
		// 이 타입에 맞는 값을 변수에 넣는다 라는 뜻이다.
		
		ClassEx ce = new ClassEx(); // ce는 만들어진(메모리에 올라가있는) ClassEx가 담겨있다.
		ce.k = 100;
		System.out.println(str);
		System.out.println(ce.str);
		ce.str = "바이";
		System.out.println(str);
		System.out.println(ce.str);
		// 클래스변수-전역변수는 정의는 그냥 하면되지만 사용은 반드시 new이후에 사용가능
		
		ClassEx ce2 = new ClassEx();
		ce2.k = 200;
		
		System.out.println(ce.k);
		System.out.println(ce2.k);
		
		ClassEx ce3 = new ClassEx();
		System.out.println(ce3.k);
		System.out.println(ce3.d);
		System.out.println(ce3.b);
		System.out.println(ce3.str);
		System.out.println(ce3.str==null);
		System.out.println(ce3.str.equals(null));
	}
}
