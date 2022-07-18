
public class ParameterEx {
	void sum(String str, int ...i) {
		// 여러개 받을 수 있는 변수는 한개만 쓸 수 있다.
		// 다른 타입의 변수도 같이 받고 싶다면 앞에 써야한다.
		// sum(10) <= int 타입의 매개변수의 개수를 무한대로 받음
		int s = 0;
		for(int x = 0 ; x < i.length;x++) {
			s=s+i[x];
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum("a",10,20,30,40,50);
		pe.sum("b");
	}
}
