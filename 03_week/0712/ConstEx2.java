// �� java ���Ͽ� ũ������ ������ ���� �� �ִ�
// ������ public�� �ݵ�� �ϳ��� �־�� �Ѵ�.
class ConEx1{
	int i;
	String str;
	ConEx1(){ // �ʱ�ȭ �ϴ� ���� 
		i = 10;
		str="�ݰ�";
	}
	ConEx1(int k){ 
		i=20;
		str="�ȳ�";
	}
	ConEx1(int k, int p){
		
	}
}


public class ConstEx2 {
	// ������(Constructor) - Ŭ������ �̸��� ����(��ҹ��� ����)
	// ���� ���ǳ�? - �����Ҷ� -> ��ġ�� ������ �ִ� -> new �ڿ� ����
	// ������ �� �ʱⰪ�� �ִ� ����
	// �������� �ۼ��� ���� �� �ְ�, �ϳ��� ���ٸ� �ƹ�������� �� �����ڸ� ����ӽ��� �ϳ� ����.
	// �ϳ��� ������ �ݵ�� �װ��� ����Ѵ�.
	
	public static void main(String[] args) {
		ConEx1 ce = new ConEx1();
		System.out.println(ce.i);
		System.out.println(ce.str);

		ConEx1 ce2 = new ConEx1(2);
		System.out.println(ce2.i);
		System.out.println(ce2.str);
		
		ConEx1 ce3 = new ConEx1(2,5);
		System.out.println(ce3.i);
		System.out.println(ce3.str);
	}
}
