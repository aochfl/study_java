class ForEx2{ 
	public static void main(String args[]){ 
		// 1~100 까지의 3의 배수의 합을 구하시오
		
		
		int total = 0;
		for(int i = 1; i <=100; i++)
		{
			if(i%3 == 0)
			{
				total+=i;
			}
		}
		System.out.println("1~100까지의 3의 배수의 합은 "+total+" 입니다");
		
		total = 0;
		for (int i = 3; i <= 100; i=i+3)
		{
			total +=i;
		}
		System.out.println("1~100까지의 3의 배수의 합은 "+total+" 입니다");
	}
}
