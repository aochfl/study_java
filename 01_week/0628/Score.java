import java.util.Scanner;

class Score{ 
/*
점수를 입력받습니다.

점수 입력: <== 입력 ex)90

결과: A
100~90 A
89~80 B
79~70 C
69~60 D
59이하 F
*/
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요");
		int score = sc.nextInt();
		
		if(100 >= score && score >= 90)
		{
			System.out.println("결과 : A");
		}
		else if(score >= 80) // 90점 이상점수에 대해서는 조건을 확인할 필요가 없음. => if-else 문 동장에 따라 위 if문이 true 일 경우 아래 구문은 무시됨
		{
			System.out.println("결과 : B");
		}
		else if(score >= 70)
		{
			System.out.println("결과 : C");
		}
		else if(score >= 60)
		{
			System.out.println("결과 : D");
		}
		else 
		{
			System.out.println("결과 : F");
		}
	}
}
