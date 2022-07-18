
public class Rect {
	private int width;
	private int height;
	
	void setSize(int w, int h) { // 받아온 값w,h 를 클래스변수 width와 height에 넣는다
		if(w>=1000) w = 1000;
		if(h>=1000) h = 1000;
		width = w;
		height = h;
	}
	
	Rect(){
	}
	Rect(int w, int h){
		setSize(w,h);
	}
	void printSize() {
		System.out.println("가로는 "+width+", 세로는 "+height+"인 사각형 입니다");
	}
}
