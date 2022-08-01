class TVRemoteController implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV전원을 켭니다");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV전원을 끕니다");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("TV소리를 올립니다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("TV소리를 내립니다");
		
	}
	
	public void changeOutline() {
		System.out.println("외부입력으로 전환합니다");
	}
}