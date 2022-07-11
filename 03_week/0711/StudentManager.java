import java.util.Scanner;

public class StudentManager {
	Student[] studentList;
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		StudentManager mgr = new StudentManager();
		
		System.out.print("����� �л��� �Է��Ͻðڽ��ϱ�?");
		int count = sc.nextInt();
		
		mgr.studentList = new Student[count];
		
		for(int i = 0 ; i< mgr.studentList.length ; i++)
		{
			mgr.studentList[i] = new Student();

			System.out.print((i+1)+"��° �л��� �й��� �Է����ּ��� ");
			mgr.studentList[i].number = sc.nextInt();
			System.out.print((i+1)+"��° �л��� �̸��� �Է����ּ��� ");
			mgr.studentList[i].name = sc.next();
			System.out.print((i+1)+"��° �л��� ���������� �Է����ּ��� ");
			mgr.studentList[i].korean = sc.nextInt();
			System.out.print((i+1)+"��° �л��� ���������� �Է����ּ��� ");
			mgr.studentList[i].english = sc.nextInt();
			System.out.print((i+1)+"��° �л��� ���������� �Է����ּ��� ");
			mgr.studentList[i].math = sc.nextInt();
		}

		int total = 0;
		
		for(int i = 0 ; i< mgr.studentList.length ; i++)
		{
			total = mgr.studentList[i].korean+
					mgr.studentList[i].english+
					mgr.studentList[i].math;
			System.out.println((i+1)+"��° �л��� "
					+ "�й��� "+mgr.studentList[i].number+", "
					+ "�̸��� "+mgr.studentList[i].name+", "
					+ "���������� "+mgr.studentList[i].korean+"��, "
					+ "���������� "+mgr.studentList[i].english+"��, "
					+ "���������� "+mgr.studentList[i].math+"��, "
					+ "���������� "+total+"��, "
					+ "��������� "+(total/3)+"�� �Դϴ�."
					);
		}
	}
}
