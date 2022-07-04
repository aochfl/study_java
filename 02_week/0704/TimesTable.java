// 구구단을 2가지 방법으로 출력해보기. 
// 2*1=2 2*2=4 ... ~ 2*9=18
// 3*1=3 3*2=6 ...
// 9*1=9 .. 9*9=81

class MultiTable2{ 
	public static void main(String args[]){ 
		int num =2, mul=1;
		
		for(num = 2; num < 10 ; num++)
		{
			for(mul=1; mul<10; mul++)
			{
				System.out.print( num + "*" + mul + "=" + (num*mul) + "\t" );
			}
			System.out.println("");
		}
		
		System.out.println("===================================================");
		
		for(mul = 1; mul < 10 ; mul++)
		{
			for(num=2; num < 10; num++)
			{
				System.out.print( num + "*" + mul + "=" + (num*mul) + "\t" );
			}
			System.out.println("");
		}
		
	}
}
