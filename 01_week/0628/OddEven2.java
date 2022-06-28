import java.util.Scanner;

class OddEven2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		
		int i = sc.nextInt(); // 숫자 입력 받기
		
		if(i%2 ==0){
			System.out.println("짝수"); 
		}
		else{
			System.out.println("홀수");
		}
	}
}
