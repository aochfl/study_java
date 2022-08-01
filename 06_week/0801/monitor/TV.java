package monitor;

public class TV implements Monitor{
	boolean power;
	int video;
	int sound;
	int volumn;
	private int VOLUMN_MIN=0;
	private int VOLUMN_MAX=10;
	
	TV(int video, int sound){
		videoIn(video);
		soundOut(sound);
		power = false;
		volumn = 3;
		informationShow();
	}
	
	@Override
	public void videoIn(int video) {
		this.video = video;
	}

	@Override
	public void soundOut(int sound) {
		this.sound = sound;
	}

	@Override
	public void turnOn() {
		power = true;
	}

	@Override
	public void turnOff() {
		power = false;
	}
	
	@Override
	public void volumnUp() {
		if(volumn < VOLUMN_MAX)
			volumn++;
		volumnShow();
	}

	@Override
	public void volumnDown() {
		if(volumn >VOLUMN_MIN)
			volumn--;
		volumnShow();
	}
	
	public void informationShow() {
		String videoName = "";
		switch(video) 
		{
		case Monitor.VIDEO_AV:
			videoName = "AV";
			break;
		case Monitor.VIDEO_DVI:
			videoName = "DVI";
			break;
		case Monitor.VIDEO_HDMI:
			videoName = "HDMI";
			break;
		case Monitor.VIDEO_OTHER:
			videoName = "OTHER";
			break;
		}
		String soundName = "";
		switch(sound) {
		case Monitor.SOUND_NONE:
			soundName="-";
			break;
		case Monitor.SOUND_EMBED:
			soundName="������ġ";
			break;
		case Monitor.SOUND_SPEAKER:
			soundName="����Ŀ";
			break;
		case Monitor.SOUND_OTHER:
			soundName="��Ÿ��ġ";
			break;
		}
		System.out.println("���� ���� �Է��� "+videoName+"�̸�, ���� �����ġ�� "+soundName+"�Դϴ�");
	}
	public void volumnShow() {
		System.out.println("���� ������ "+volumn+"�Դϴ�");
	}

	public static void main(String[] args) {
		TV tv = new TV(Monitor.VIDEO_HDMI,Monitor.SOUND_SPEAKER);

		tv.volumnDown();
		tv.volumnDown();
		tv.volumnDown();
		tv.volumnDown();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
		tv.volumnUp();
	}
}
