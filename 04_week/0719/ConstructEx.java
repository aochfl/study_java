class Constructor{
	int num;
	String str;
	
	// 생성자 하나만 잘 만들면 된다. 중복 코드가 줄어든다.
	public Constructor() {
		this("안녕",10);
	}
	public Constructor(int a) {
		this("안녕",a);
	}
	public Constructor(String s, int a) {
		this.num=a;
		this.str=s;
	}
}
public class ConstructEx {
	public static void main(String[] args) {
		
	}
}
