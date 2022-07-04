class ForEx6{ 
// 10단위로 줄넘김을 사용하여 100까지 출력
// ex)
// 1 2 3 4 5 6 7 8 9 10
// 11 12 13..
// ..
// 91 92 93 94 95 96 97 98 99 100
	public static void main(String args[]){ 
		//if문 사용
		for(int i = 1 ; i <= 100 ; i++)
		{
			System.out.print(i+"\t");
			if(i %10 == 0)
			{
				System.out.println("");
			}
		}
		System.out.println("========================");
		
		// 2중 for문 사용
		for(int i = 0 ; i < 10; i++)
		{
			for(int j = 1; j<= 10 ; j++)
			{
				System.out.print((j+i*10)+"\t");
			}
			System.out.println("");
		}
		System.out.println("========================");
		
		
	}
}
