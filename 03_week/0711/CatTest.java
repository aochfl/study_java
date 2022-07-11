import java.util.Scanner;

public class CatTest {
	public static void main(String[] args) {
		
		Car c1= new Car(); // 같은폴더(패키지)에 Car class 가 존재하므로
		
		c1.WheelCount = 4;
		c1.color = "red";
		c1.name="머스탱";
		
		Car c2 = new Car();
		c2.WheelCount = 8;
		c2.color="국방색";
		c2.name="육공트럭";
		
		// 자바에서 우리가 작성한 클래스는 생성을 여러개 할 수 있는 일종의 틀이다.
		// new를 통해서 클래스를 사용할 수 있는 상태로 만든다.
		
		Car[] cars = new Car[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0 ; i < cars.length ; i++)
		{
			cars[i] = new Car();
			System.out.print((i+1)+"번째 차량의 바퀴수를 입력하세요:");
			cars[i].WheelCount = sc.nextInt();
			
			System.out.print((i+1)+"번째 차량의 색상을 입력하세요:");
			cars[i].color = sc.next();
			
			System.out.print((i+1)+"번째 차량의 차종을 입력하세요:");
			cars[i].name = sc.next();
		}		
		
		sc.close();
		
		for(int i= 0 ; i < cars.length ; i++)
		{
			System.out.println((i+1)+"번째 차량의 "
					+ "바퀴수는 "+cars[i].WheelCount+"개, "
					+ "색상은 "+cars[i].color +", "
					+ "차종은 "+cars[i].name+"입니다.");
		}
	}
}
