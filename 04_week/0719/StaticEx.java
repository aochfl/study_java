class Static{
	static int i; // static ���� - �� ���� ������ 1���� ����� ���ϴ�.
	int j; // �� Ŭ������ ������ ��� �ν��Ͻ��� static ���� �����Ѵ�
}
public class StaticEx {
	public static void main(String[] args) {
		Static s1 = new Static();
		s1.i++;
		s1.j++;
		System.out.println(s1.i + ":" + s1.j);

		Static s2 = new Static();
		s2.i++;
		s2.j++;
		System.out.println(s2.i + ":" + s2.j);
	}
}
