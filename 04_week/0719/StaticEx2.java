
public class StaticEx2 {
	public static void main(String[] args) {
		
		// ������ �ʴ� ���� ���� ������ �޼��带 �ַ� ����ó���Ͽ� ����Ѵ�.
		System.out.println(Math.PI);
		System.out.print(Math.random());
		
		System.out.println(Static.i); // �������� : Ŭ������.������ ���ٰ���
		
		Static s = new Static();
		System.out.println(s.j);
	}
}
