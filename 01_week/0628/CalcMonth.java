import java.util.Scanner;

class CalcMonth{ 
/*
년도를 입력합니다.
입력한 년도가 윤년인가? 아닌가?
윤년 = 2월 29일까지 있는 해

// 4로 나누었을때 0인경우 윤년
// 100으로 나누었을때 0인경우 윤년이 아님
// 400으로 나누었을때 0인경우 윤년
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 :");
		int year = sc.nextInt();
		boolean yoon = false;
		
		if(year %400 == 0)
		{
			yoon = true;
		}
		else if (year % 4 == 0)
		{
			if(year %100 == 0)
			{
				yoon = false;
			}
			else
			{
				yoon = true;
			}
		}
		
		if(yoon)
		{
			System.out.print("입력하신 년도는 윤년입니다;");
		}
		else
		{
			System.out.print("입력하신 년도는 윤년이 아닙니다");
		}
	}
}
