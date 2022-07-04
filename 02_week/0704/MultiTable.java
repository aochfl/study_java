import java.util.Scanner;

class MultiTable{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		// 단은 고정되어있다.
		// 단에 곱하는 수는 1부터 시작해서 9까지 1씩 증가
		
		
		for(int dan = 2; dan < 10; dan++)
		{
			for(int num = 1;num<10;num++)
			{
				System.out.println(dan + "*"+num+"="+dan*num);
			}
		}
		
	}
}
