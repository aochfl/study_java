import java.util.Scanner;

class ShowEnMonth{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 (1~12까지): ");
		int month = sc.nextInt();
		
		String english;
		
		if(month == 1)	english = "January";
		else if (month == 2)	english = "February";
		else if (month == 3)	english = "March";
		else if (month == 4)	english = "April";
		else if (month == 5)	english = "May";
		else if (month == 6)	english = "June";
		else if (month == 7)	english = "July";
		else if (month == 8)	english = "August";
		else if (month == 9)	english = "September";
		else if (month == 10)	english = "October";
		else if (month == 11)	english = "November";
		else if (month == 12)	english = "December";
		else english = "잘못입력되었습니다";
		
		System.out.print(month+"월은 영어로 "+english+"입니다");
	}
}
