class Operator{
	/* 	전부 주석
		연산자 = 기본 4칙연산 + 알파
		+,-,*,/,%
	*/
	public static void main(String args[]){
		int i = 10;
		int j = 3;
		//System.out.printf("+ : %d\n",(i+j));
		//System.out.printf("- : %d\n",(i-j));
		//System.out.printf("* : %d\n",(i*j));
		//System.out.printf("/ : %d\n",(i/j));
		//System.out.printf("%% : %d\n",(i%j));
		
		//i++;
		//j--;
		//System.out.printf("i++ : %d\n",i); // i = i+1
		//System.out.printf("j-- : %d\n",j); // j = j-1
		
		
		//System.out.printf("i++ : %d\n",i++); // i = i+1 
		//System.out.printf("j-- : %d\n",j--); // j = j-1
		
		//System.out.println(i > j);
		//System.out.println(i < j);
		//System.out.println(i >= j);
		//System.out.println(i <= j);
		
		// and (&&)
		// 그리고
		// 양쪽 중 둘다 true여야 결과가 true임
		//System.out.println((10>2) && (5>2)); 	// true
		//System.out.println(true && true);		// true
		//System.out.println((10>2) && (5<2));	// false
		//System.out.println(true && false);		// false
		
		// or (||)
		// 또는
		// 양쪽 중 한쪽만 true면 결과가 true 임
		//System.out.println((10>2) || (5>2)); 	// true
		//System.out.println(true || true);		// true
		//System.out.println((10>2) || (5<2));	// true
		//System.out.println(true || false);		// true
		
		// 비교 연산자 
		//System.out.println(10 == 20); 	// false 	같다
		//System.out.println(10 != 20); 	// true 	같지않다
		
		// 삼(3)항 연산자
		// 조건 ? 참 : 거짓
		System.out.println(i>j?"참":"거짓");
	}
}
