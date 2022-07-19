
public class Engine {
	int cc;
	String oil;
	
	public Engine() {
		this(2000,"가솔린");// 생성자 재사용
	}
	public Engine(int cc, String oil) {
		this.cc = cc;
		this.oil = oil;
	}
	public void printInfo() {
		System.out.println(cc+"엔진이며 "+oil+"을 사용합니다");
	}
}
