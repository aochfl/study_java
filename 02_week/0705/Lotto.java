class Lotto{ 
	public static void main(String args[]){ 
		// todo => 랜덤한 배열의 번호를 6개 뽑아서 그 안에 값 가져오기	
		int ran =0 ;
		int[] nums = new int[6];
		int count = 0;
		boolean exist = false;
		while(count != 6)
		{
			exist = false;
			ran = (int)(Math.random()*45)+1;
			
			for(int i = 0 ; i < count ; i++)
			{
				if(nums[i] == ran)
				{
					exist = true;
				}
			}
			if(exist == false)
			{
				nums[count] = ran;
				count++;
			}
		}
		// todo 숫자들을 작은순부터 정렬하는 코드
		for(int i = 0 ; i < nums.length; i++)
		{
			int min = i;
			for(int j = i+1 ; j < nums.length ; j++ )
			{
				if(nums[min] > nums[j])
				{
					min = j;
				}
			}
			int tmp = nums[i];
			nums[i] = nums[min];
			nums[min]=tmp;
		}
		
		for(int i =0; i < 6; i++)
		{
			System.out.println(nums[i]+"  ");
		}
		
	}
}
