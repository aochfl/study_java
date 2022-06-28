import java.util.Scanner;

class Calc{ 
/*
숫자 3개를 입력받아서
합계/ 평균 / 최소 / 최대 출력
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요:");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요:");
		int b = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요:");
		int c = sc.nextInt();
		
		int min= 0,max = 0;
		if(a > b)
		{
			if(a>c)
			{
				max = a;
				if(b>c)
				{
					min = c;
				}
				else 
				{
					min = b;
				}
			}
			else
			{
				max = c;
				min = b;	
			}
		}
		else
		{
			if(b>c)
			{
				max = b;
				if(a >c)
				{
					min = c;
				}
				else 
				{
					min = a;
				}
			}
			else 
			{
				max = c;
				min = a;
			}
		}
		
		
		System.out.printf("합계 : %d \n평균 : %.2f\n최소 : %d\n최대 : %d",a+b+c,(double)((a+b+c)/3),min,max);
	}
}
