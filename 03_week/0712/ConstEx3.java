class ConEx2{
	int i ;
	String s;
	ConEx2() { // �⺻�����ڰ� �ʼ��� �ƴϴ�
		i=10;
		s="�ȳ�";
	}
	ConEx2(int k) { // �������� �޶� ���������, Ÿ�԰� ����, ������ ����
		i=k;
		s="�ȳ�";
	}
	ConEx2(String str) {
		s= str;
	}
	ConEx2(int k , String str){
		i=k;
		s=str;				
		System.out.println("���ڹ���");
	}
	ConEx2(String str, int k){
		i=k;
		s=str;
		System.out.println("���ڼ���");
	}
	void printf()
	{
		System.out.println("i="+ i +" / s="+ s);
	}
}


public class ConstEx3 {
	public static void main(String[] args) {
		ConEx2 ce = new ConEx2();
		ce.printf();
		ConEx2 ce2 = new ConEx2(100);
		ce2.printf();
		ConEx2 ce3 = new ConEx2("���");
		ce3.printf();
		ConEx2 ce4 = new ConEx2(1000,"���");
		ce4.printf();
		ConEx2 ce5 = new ConEx2("���",5000);
		ce5.printf();
	}
}
