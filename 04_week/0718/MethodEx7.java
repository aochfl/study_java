
public class MethodEx7 {
	int plus(int x, int y) {
		return x+y;
	}
	int minus(int x, int y) {
		return x-y;
	}

	int multi(int x, int y) {
		return x*y;
	}

	double divide(int x, int y) {
		return (double)x/y;
	}
	
	public static void main(String[] args) {
		MethodEx7 me = new MethodEx7();
		System.out.println(me.plus(100,50)); 
		System.out.println(me.minus(100,50));
		System.out.println(me.multi(100,50));
		System.out.println(me.divide(100,30));
	}
}
