
public class RectTest { // 사각형을 만들어서 쓰는 클래스
	public static void main(String[] args) {
		Rect r = new Rect();
		r.setSize(10000,100); // 가로100 세로100의 크기가 만들어 진다.
		r.printSize(); // 가로는 100 세로는 100 인 사각형 입니다
		
		Rect r2 = new Rect(50000000,200000);
		r2.printSize(); // 가로는 100 세로는 100 인 사각형 입니다
	}
}
