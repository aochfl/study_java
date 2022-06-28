import java.util.Scanner;

class KeyCheck{ 
/*
인터넷에서 아스키 코드를 확인하면서 계산 해봅시다.
입력한 문자가 모음인가 아닌가? (a e i o u)
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파뱃을 입력하시오");
		char i = sc.next().charAt(0);
		// char 타입과 int 타입은 자유롭게 형변환이 됨.... 하지만 가급적 맞춰주는게 좋겠지
		
		if( i == 65 || i == 97  || // a
			i == 69 || i == 101 || // e
			i == 73 || i == 105 || // i
			i == 79 || i == 111 || // o
			i == 85 || i == 117) // u
			{
				System.out.print("결과 : 모음");
			}
		else{
			System.out.print("결과 : 자음");
		}
	}
}
