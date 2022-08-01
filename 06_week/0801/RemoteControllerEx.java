
public class RemoteControllerEx {
	public static void main(String[] args) {
		TVRemoteController tvRemote = new TVRemoteController();
		AirConditionalRemoteController airconRemote = new AirConditionalRemoteController();
		SetupBoxRemoteController setupboxRemote = new SetupBoxRemoteController(); 
		
		tvRemote.turnOn();
		tvRemote.soundUp();
		tvRemote.soundDown();
		tvRemote.changeOutline();
		tvRemote.turnOff();
		
		airconRemote.turnOn();
		airconRemote.soundUp();
		airconRemote.soundDown();
		airconRemote.tempUp();
		airconRemote.tempDown();
		airconRemote.turnOff();
		
		setupboxRemote.turnOn();
		setupboxRemote.soundUp();
		setupboxRemote.soundDown();
		setupboxRemote.changeKidsChannel();
		setupboxRemote.changeMovieChannel();
		setupboxRemote.turnOff();
	}
}
