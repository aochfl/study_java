class SetupBoxRemoteController implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("����ڽ� ������ �մϴ�");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����ڽ� ������ ���ϴ�");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("����ڽ� �Ҹ��� �ø��ϴ�");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("����ڽ� �Ҹ��� �����ϴ�");
		
	}
	
	public void changeMovieChannel() {
		System.out.println("��ȭä������ �̵��մϴ�");
	}
	public void changeKidsChannel() {
		System.out.println("Ű��ä�η� �̵��մϴ�.");
	}
	
}