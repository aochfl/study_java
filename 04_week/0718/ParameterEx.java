
public class ParameterEx {
	void sum(String str, int ...i) {
		// ������ ���� �� �ִ� ������ �Ѱ��� �� �� �ִ�.
		// �ٸ� Ÿ���� ������ ���� �ް� �ʹٸ� �տ� ����Ѵ�.
		// sum(10) <= int Ÿ���� �Ű������� ������ ���Ѵ�� ����
		int s = 0;
		for(int x = 0 ; x < i.length;x++) {
			s=s+i[x];
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum("a",10,20,30,40,50);
		pe.sum("b");
	}
}
