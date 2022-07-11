
public class VariableEx { // 클래스
	static int k; // 클래스 변수. 클래스 변수는 클래스의 소속{}이다. 이 변수는 이 클래스 내부에 모두가 사용가능하다. 전역변수
	String str = "헬로";
	
	public static void main(String[] args) { //메서드(기능) - 이 메서드도 클래스소속이다
		k =100;
		System.out.println(k);
		int i = 10; // 메서드에 포함된 변수 메서드의 영역은 {} 사이이다.
		int j = 10;
		System.out.println(i == j);
		
		String str1 = "안녕";
		String str2 = new String("안녕"); // new= 새로 메모리에 만들어라
		System.out.println(str1 == str2);
		
		String str3 = str2; // str2의 값을 str3에 넣은 것이 아닌 주소를 복사해 str3에 줬기 때문에 true
		System.out.println(str2==str3);
		
		String str4="안녕";
		System.out.println(str1 == str4);
		
		// == 스택비교      .equals() 값비교
		System.out.println(str1.equals(str2)); // 레퍼런스 타입비교
	}
}
