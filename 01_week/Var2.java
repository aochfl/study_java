class Var2{
	public static void main(String args[]){
		int i = 100;
		int j = 200;
		int sum = i + j;
		// 자바에서는 = 한개는 오른쪽 값을 왼쪽에 담는다는 뜻이다.
		// == 2개 일 경우 같다 라는 뜻이다.
		System.out.println(sum);
		
		char c = 'a'; // 한글자는 홀따옴표 여러글자는 쌍따옴표
		char d = 'b';
		int sum2 = c+d; // 문자를 숫자로 자동으로 바꿔서 계산됨 = 형변환
		System.out.println(sum); 
		System.out.println((int)'A'); //형변환 = type 변환
		
		int a = 10;
		int z = 2147483647;
		double b = 5.7;
		System.out.println(a+b); // int와 double을 더하면 double이 된다
		System.out.println((int)(a+b)); // 소수점 이하는 무조건 잘림
		System.out.println((double)a+b); // 
	}
}