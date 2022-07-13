// 한 java 파일에 크래스가 여러개 있을 수 있다
// 하지만 public은 반드시 하나만 있어야 한다.
class ConEx1{
	int i;
	String str;
	ConEx1(){ // 초기화 하는 역할 
		i = 10;
		str="반갑";
	}
	ConEx1(int k){ 
		i=20;
		str="안녕";
	}
	ConEx1(int k, int p){
		
	}
}


public class ConstEx2 {
	// 생성자(Constructor) - 클래스와 이름이 같다(대소문자 포함)
	// 언제 사용되나? - 생성할때 -> 위치가 정해져 있다 -> new 뒤에 쓴다
	// 생성할 때 초기값을 주는 역할
	// 여러개를 작성해 놓을 수 있고, 하나도 없다면 아무내용없는 빈 생성자를 가상머신이 하나 만듬.
	// 하나라도 있으면 반드시 그것을 써야한다.
	
	public static void main(String[] args) {
		ConEx1 ce = new ConEx1();
		System.out.println(ce.i);
		System.out.println(ce.str);

		ConEx1 ce2 = new ConEx1(2);
		System.out.println(ce2.i);
		System.out.println(ce2.str);
		
		ConEx1 ce3 = new ConEx1(2,5);
		System.out.println(ce3.i);
		System.out.println(ce3.str);
	}
}
