import java.util.Scanner;

public class CatTest {
	public static void main(String[] args) {
		
		Car c1= new Car(); // ��������(��Ű��)�� Car class �� �����ϹǷ�
		
		c1.WheelCount = 4;
		c1.color = "red";
		c1.name="�ӽ���";
		
		Car c2 = new Car();
		c2.WheelCount = 8;
		c2.color="�����";
		c2.name="����Ʈ��";
		
		// �ڹٿ��� �츮�� �ۼ��� Ŭ������ ������ ������ �� �� �ִ� ������ Ʋ�̴�.
		// new�� ���ؼ� Ŭ������ ����� �� �ִ� ���·� �����.
		
		Car[] cars = new Car[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0 ; i < cars.length ; i++)
		{
			cars[i] = new Car();
			System.out.print((i+1)+"��° ������ �������� �Է��ϼ���:");
			cars[i].WheelCount = sc.nextInt();
			
			System.out.print((i+1)+"��° ������ ������ �Է��ϼ���:");
			cars[i].color = sc.next();
			
			System.out.print((i+1)+"��° ������ ������ �Է��ϼ���:");
			cars[i].name = sc.next();
		}		
		
		sc.close();
		
		for(int i= 0 ; i < cars.length ; i++)
		{
			System.out.println((i+1)+"��° ������ "
					+ "�������� "+cars[i].WheelCount+"��, "
					+ "������ "+cars[i].color +", "
					+ "������ "+cars[i].name+"�Դϴ�.");
		}
	}
}
