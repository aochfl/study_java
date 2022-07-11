import java.util.Scanner;

public class StudentManager {
	Student[] studentList;
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		StudentManager mgr = new StudentManager();
		
		System.out.print("몇명의 학생을 입력하시겠습니까?");
		int count = sc.nextInt();
		
		mgr.studentList = new Student[count];
		
		for(int i = 0 ; i< mgr.studentList.length ; i++)
		{
			mgr.studentList[i] = new Student();

			System.out.print((i+1)+"번째 학생의 학번을 입력해주세요 ");
			mgr.studentList[i].number = sc.nextInt();
			System.out.print((i+1)+"번째 학생의 이름을 입력해주세요 ");
			mgr.studentList[i].name = sc.next();
			System.out.print((i+1)+"번째 학생의 국어점수를 입력해주세요 ");
			mgr.studentList[i].korean = sc.nextInt();
			System.out.print((i+1)+"번째 학생의 영어점수를 입력해주세요 ");
			mgr.studentList[i].english = sc.nextInt();
			System.out.print((i+1)+"번째 학생의 수학점수를 입력해주세요 ");
			mgr.studentList[i].math = sc.nextInt();
		}

		int total = 0;
		
		for(int i = 0 ; i< mgr.studentList.length ; i++)
		{
			total = mgr.studentList[i].korean+
					mgr.studentList[i].english+
					mgr.studentList[i].math;
			System.out.println((i+1)+"번째 학생의 "
					+ "학번은 "+mgr.studentList[i].number+", "
					+ "이름은 "+mgr.studentList[i].name+", "
					+ "국어점수는 "+mgr.studentList[i].korean+"점, "
					+ "영어점수는 "+mgr.studentList[i].english+"점, "
					+ "수학점수는 "+mgr.studentList[i].math+"점, "
					+ "총합점수는 "+total+"점, "
					+ "평균점수는 "+(total/3)+"점 입니다."
					);
		}
	}
}
