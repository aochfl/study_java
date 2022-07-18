
public class MethodEx4 {
	// 반환되는 타입을 써야한다
	
	int plus() { // 메서드명은 반드시 소문자로 시작
		
		return 0;
	}
	
	String str() {
		return "a";
	}
	
	double dr() {
		return 0.0;
	}
	
	public static void main(String[] args) {
		MethodEx4 me = new MethodEx4();
		String s = me.str();
		System.out.println(s);
	}
}
