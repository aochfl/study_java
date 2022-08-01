class AirConditionalRemoteController implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("에어컨 전원을 켭니다");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("에어컨 전원을 끕니다");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("지원하지 않는 기능입니다");
		
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("지원하지 않는 기능입니다");
		
	}
	
	public void tempUp() {
		System.out.println("에어컨 온도를 올립니다");
	}
	public void tempDown() {
		System.out.println("에어컨 온도를 내립니다");
	}
}