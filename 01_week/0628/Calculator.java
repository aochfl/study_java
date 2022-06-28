import java.util.Scanner;

class Calculator{ 
/*
4칙 연산기

첫번째 숫자 입력: <== 입력 ex)10
두번째 숫자 입력: <== 입력 ex)5
수식 입력 : <== 입력 ex) +

계산결과 15 입니다
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력: ");
		int b = sc.nextInt();
		System.out.print("연산자 입력: ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		if(op=='+')
		{
			result = a+b;
		}
		else if (op == '-')
		{
			result = a-b;
		}
		else if (op == '*')
		{
			result = a*b;
		}
		else if(op == '/')
		{
			result = a/b;
		}
		else if(op == '%')
		{
			result = a%b;
		}
		
		System.out.printf("계산 결과는 %d 입니다.",result);
	}
}
