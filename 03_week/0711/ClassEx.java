
public class ClassEx {
	int k ; // ���������� ���� ���� ������ �˾Ƽ� �ʱ�ȭ�ȴ�.
	double d;
	boolean b;
	String str;
	
	public static void main(String[] args) {
		
		// Ŭ���� �Ҽ� ������ �׳� ����� �ȵȴ�. �ݵ�� �޸𸮿� �÷��� ����� �ؾ��Ѵ�. => �޸𸮿� new�� ���� �÷����Ѵ�.
		// System.out.println(k);
		// System.out.println(str);
		
		String str = "���";
		// ���ڿ�Ÿ�� ���� = ���ڿ�
		// �� Ÿ�Կ� �´� ���� ������ �ִ´� ��� ���̴�.
		
		ClassEx ce = new ClassEx(); // ce�� �������(�޸𸮿� �ö��ִ�) ClassEx�� ����ִ�.
		ce.k = 100;
		System.out.println(str);
		System.out.println(ce.str);
		ce.str = "����";
		System.out.println(str);
		System.out.println(ce.str);
		// Ŭ��������-���������� ���Ǵ� �׳� �ϸ������ ����� �ݵ�� new���Ŀ� ��밡��
		
		ClassEx ce2 = new ClassEx();
		ce2.k = 200;
		
		System.out.println(ce.k);
		System.out.println(ce2.k);
		
		ClassEx ce3 = new ClassEx();
		System.out.println(ce3.k);
		System.out.println(ce3.d);
		System.out.println(ce3.b);
		System.out.println(ce3.str);
		System.out.println(ce3.str==null);
		System.out.println(ce3.str.equals(null));
	}
}
