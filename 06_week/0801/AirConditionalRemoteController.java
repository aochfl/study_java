class AirConditionalRemoteController implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ �մϴ�");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("������ ������ ���ϴ�");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("�������� �ʴ� ����Դϴ�");
		
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("�������� �ʴ� ����Դϴ�");
		
	}
	
	public void tempUp() {
		System.out.println("������ �µ��� �ø��ϴ�");
	}
	public void tempDown() {
		System.out.println("������ �µ��� �����ϴ�");
	}
}