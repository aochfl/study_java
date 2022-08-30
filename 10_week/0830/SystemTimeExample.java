package _0830;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		long time11 = System.nanoTime();
		
		int sum = 0;
		for(int i =1; i <=1000000; i++) {
			sum += i;
			
		}

		long time2 = System.currentTimeMillis();
		long time22 = System.nanoTime();
		
		System.out.println("1~100000 까지의 합 "+ sum);
		System.out.println("계산에 " +(time2-time1)+" 밀리초가 소요되었습니다.");
		System.out.println("계산에 " +(time22-time11)+" 나노초가 소요되었습니다.");
	}
}
