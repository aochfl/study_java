package _0830;

import java.util.Random;

public class MathEx {

	public static void main(String[] args) {
		// 실제 수학 고잇ㄱ에 가까운 메서드들이라서 new 로 사용하는 경우는 많지 않고
		// 대부분 static 메서드이다.
		System.out.println(Math.abs(-10));
		
		double r = Math.random();
		System.out.println(r);
		
		Random ran = new Random();
		int ir = ran.nextInt(100);
		double dr = ran.nextDouble();
		
		System.out.println(ir);
		System.out.println(dr);
		
		// 1~10  사이의 랜덤
		int ran2 = (int)Math.floor(r*10)+1;
		System.out.println(ran2);
	}
}
