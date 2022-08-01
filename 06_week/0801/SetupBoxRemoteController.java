class SetupBoxRemoteController implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("셋톱박스 전원을 켭니다");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("셋톱박스 전원을 끕니다");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("셋톱박스 소리를 올립니다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("셋톱박스 소리를 내립니다");
		
	}
	
	public void changeMovieChannel() {
		System.out.println("영화채널으로 이동합니다");
	}
	public void changeKidsChannel() {
		System.out.println("키즈채널로 이동합니다.");
	}
	
}