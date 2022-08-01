package monitor;

public interface Monitor {
	public int VIDEO_HDMI = 1;
	public int VIDEO_DVI = 2;
	public int VIDEO_AV = 3;
	public int VIDEO_OTHER = 4;
	
	public int SOUND_NONE = 0;
	public int SOUND_SPEAKER = 1;
	public int SOUND_EMBED = 2;
	public int SOUND_OTHER = 3;
	
	void videoIn(int video);
	void soundOut(int sound);
	
	void turnOn();
	void turnOff();
	void volumnUp();
	void volumnDown();
	
}
