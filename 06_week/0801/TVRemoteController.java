class TVRemoteController implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV������ �մϴ�");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV������ ���ϴ�");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("TV�Ҹ��� �ø��ϴ�");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("TV�Ҹ��� �����ϴ�");
		
	}
	
	public void changeOutline() {
		System.out.println("�ܺ��Է����� ��ȯ�մϴ�");
	}
}