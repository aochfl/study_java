
public class VariableEx { // Ŭ����
	static int k; // Ŭ���� ����. Ŭ���� ������ Ŭ������ �Ҽ�{}�̴�. �� ������ �� Ŭ���� ���ο� ��ΰ� ��밡���ϴ�. ��������
	String str = "���";
	
	public static void main(String[] args) { //�޼���(���) - �� �޼��嵵 Ŭ�����Ҽ��̴�
		k =100;
		System.out.println(k);
		int i = 10; // �޼��忡 ���Ե� ���� �޼����� ������ {} �����̴�.
		int j = 10;
		System.out.println(i == j);
		
		String str1 = "�ȳ�";
		String str2 = new String("�ȳ�"); // new= ���� �޸𸮿� ������
		System.out.println(str1 == str2);
		
		String str3 = str2; // str2�� ���� str3�� ���� ���� �ƴ� �ּҸ� ������ str3�� ��� ������ true
		System.out.println(str2==str3);
		
		String str4="�ȳ�";
		System.out.println(str1 == str4);
		
		// == ���ú�      .equals() ����
		System.out.println(str1.equals(str2)); // ���۷��� Ÿ�Ժ�
	}
}
