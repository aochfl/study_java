
public class Engine {
	int cc;
	String oil;
	
	public Engine() {
		this(2000,"���ָ�");// ������ ����
	}
	public Engine(int cc, String oil) {
		this.cc = cc;
		this.oil = oil;
	}
	public void printInfo() {
		System.out.println(cc+"�����̸� "+oil+"�� ����մϴ�");
	}
}
