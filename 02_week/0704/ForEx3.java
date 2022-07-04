class ForEx3{ 
	public static void main(String args[]){ 
		//1~100까지의 전체 합
		//1~100까지 홀수의 합
		//1~100까지 짝수의 합
		//세가지를 동시에 출력하시오
		
		int i=0;
		int j=0;
		int total = 0;
		
		for(int num = 1;num<=100 ; num++)
		{
			if(num%2 == 1)
			{
				i+=num;
			}
			else
			{
				j+=num;
			}
		}
		System.out.println("1~100까지의 홀수의 합은 "+i+"이며, 짝수의 합은 "+j+"이며, 전체의 합은 "+(i+j)+"입니다");
		
	}
}
