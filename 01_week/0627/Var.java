class Var{
	public static void main(String args[]){
		// 변수 = 변하는 수 = 변하는 값을 담는 상자
		// 상수 = 절대로 변하지 않는 수
		
		int 	박스1 = 2147483647;
		long 	box1= 2147483649L;
		float 	박스2 = 5.0f;
		double 	box2= 5.0;
		char 	박스3 = 'A';
		char 	박스X = '한'; // 순수하게 바이트 무시하고 한글자
		String	박스4 = "안녕";
		boolean box5= true;
		
		System.out.println("박스1="+박스1);
		박스1 = 200;
		System.out.println("박스1="+박스1);
		
		System.out.println("안녕");
		System.out.println(100);
	}
}

// 1바이트는 한글자(영문1글자)
// A => 1byte
