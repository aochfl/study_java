import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		int[][] schoolScore = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		String[] cls = {"국어","영어","수학"};
		
		for( int i = 0; i< schoolScore.length ; i++)
		{
			for(int j = 0 ; j < schoolScore[i].length; j++)
			{
				System.out.println((i+1)+"번째 학생의 "+cls[j]+"점수를 입력하세요");
				schoolScore[i][j]= sc.nextInt();
			}
		}
		
		int[] sum = {0,0,0};

		for(int i = 0 ; i < schoolScore.length ; i++)
		{
			for(int j = 0 ; j < schoolScore[i].length; j++)
			{
				sum[j] += schoolScore[i][j];
			}
			System.out.println((i+1)+"번째 학생의 총합 점수는 "+sum[i]+"점 입니다");
		}

		System.out.println("국어 과목의 평균 점수는 "+sum[0]/3+"점 입니다");
		System.out.println("영어 과목의 평균 점수는 "+sum[1]/3+"점 입니다");
		System.out.println("수학 과목의 평균 점수는 "+sum[2]/3+"점 입니다");

		
		
	}
}
