class Aircon{
	int power;
}

public class EnumEx1 {

	public static void main(String[] args) {
		// ��� = ������ �ʴ� �� - ������ �ݴ븻 - ������ ���� ������ �ִ� ����
		// 100 <- ���, "�ȳ�" <- ���
		// ����� �׻� �����Ǿ� �ִ� ��
		Aircon a = new Aircon();
		final int ON = 1;
		final int OFF = 0;
		
		a.power=ON;
		if(a.power==ON) {
			System.out.println("��������");
		}
		else if(a.power==OFF) {
			System.out.println("��������");
		}
	}

}
