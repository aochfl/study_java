import java.util.Scanner;

public class Score {
	
	public static void main(String[] args) {
		int[][] schoolScore = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		String[] cls = {"����","����","����"};
		
		for( int i = 0; i< schoolScore.length ; i++)
		{
			for(int j = 0 ; j < schoolScore[i].length; j++)
			{
				System.out.println((i+1)+"��° �л��� "+cls[j]+"������ �Է��ϼ���");
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
			System.out.println((i+1)+"��° �л��� ���� ������ "+sum[i]+"�� �Դϴ�");
		}

		System.out.println("���� ������ ��� ������ "+sum[0]/3+"�� �Դϴ�");
		System.out.println("���� ������ ��� ������ "+sum[1]/3+"�� �Դϴ�");
		System.out.println("���� ������ ��� ������ "+sum[2]/3+"�� �Դϴ�");

		
		
	}
}
