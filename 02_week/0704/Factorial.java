import java.util.Scanner;

class Factorial{  // 차례곱
	// 숫자입력을 1개 받습니다.
	// 1~ 입력받은 숫자까지의 곱
	// ex) 5를 입력 받으면 1*2*3*4*5 의 값을 출력
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산할 팩토리얼의 값을 입력하세요: ");
		int num = sc.nextInt();
		int total = 1;
		for(int i = 1; i<= num ; i++)
		{
			total *= i;
		}
		System.out.println("1 부터 "+num+"까지의 곱은 "+total+" 입니다" );
	}
}
