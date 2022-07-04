class Num369{ 
// 369 출력 숫자에 3 6 9 가 들어가면 "짝"으로 출력
	public static void main(String args[]){ 
		{
			boolean clap = false;
			int i = 0;
			int j = 0;
			int k = 0;
			
			for(int num = 1; num<= 100; num++)
			{
				clap = false;
				
				i = num%10;
				if(i> 0 && i %3 == 0) // 1의자리 369
				{
					clap = true;
					System.out.print("짝");
				}
				
				if(num > 10) // 10의자리 369
				{
					j = (num/10) %10;
					if(j > 0 && j %3 == 0)
					{
						clap = true;
						System.out.print("짝");
					}
				}
				
				if(num > 100) // // 100의자리 369
				{
					k = (num/100) % 10;
					if( k > 0 && k % 3 == 0)
					{
						clap = true;
						System.out.print("짝");
					}
				}
				if(clap == false) // 박수를 안쳤을 경우
				{
					System.out.print(num);
				}
				
				// 이쁘게 정렬하기
				System.out.print("\t");
				if(i%10 == 0)
				{
					System.out.println("");
				}
			}
			System.out.println("==================");
		}
		
		
		// 아래 방법은 369가 겹쳤을때 짝을 한번만 함
		int num =0;
		for(int i = 1; i<= 10 ; i++)
		{
			for(int j = 1 ; j <= 10; j++)
			{
				num++;
				if(j%3==0)
				{
					System.out.print("짝");
				}
				else if(num%30== 0)
				{
					System.out.print("짝");
				}
				else if(num > 10 &&num/10 % 3 == 0)
				{
					System.out.print("짝");
				}
				else
				{
					System.out.print(num);
				}
				System.out.print("\t");
			}
			System.out.println("");
		}
			
			
	}
}
