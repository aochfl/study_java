import java.util.Scanner;

class DoWhileEx{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		// int num = 5;
		// do // while(조건) 과 상관없이 무조건 1번은 실행됨
		// {
			// System.out.println("출력");
		// }while(num < 2);
		
		int num = 4;
		do{
			System.out.println(num);
			num++;
		}while(num<=5);
	}
}
