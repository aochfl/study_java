
public class Rect {
	private int width;
	private int height;
	
	void setSize(int w, int h) { // �޾ƿ� ��w,h �� Ŭ�������� width�� height�� �ִ´�
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
		System.out.println("���δ� "+width+", ���δ� "+height+"�� �簢�� �Դϴ�");
	}
}
