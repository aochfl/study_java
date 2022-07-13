class ConEx2{
	int i ;
	String s;
	ConEx2() { // 기본생성자가 필수는 아니다
		i=10;
		s="안녕";
	}
	ConEx2(int k) { // 변수명은 달라도 상관없으며, 타입과 갯수, 순서로 구분
		i=k;
		s="안녕";
	}
	ConEx2(String str) {
		s= str;
	}
	ConEx2(int k , String str){
		i=k;
		s=str;				
		System.out.println("숫자문자");
	}
	ConEx2(String str, int k){
		i=k;
		s=str;
		System.out.println("문자숫자");
	}
	void printf()
	{
		System.out.println("i="+ i +" / s="+ s);
	}
}


public class ConstEx3 {
	public static void main(String[] args) {
		ConEx2 ce = new ConEx2();
		ce.printf();
		ConEx2 ce2 = new ConEx2(100);
		ce2.printf();
		ConEx2 ce3 = new ConEx2("헬로");
		ce3.printf();
		ConEx2 ce4 = new ConEx2(1000,"헬로");
		ce4.printf();
		ConEx2 ce5 = new ConEx2("헬로",5000);
		ce5.printf();
	}
}
