package chap7.exercise11;

public class Exercise7_11 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}

}

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void setChannel(int channel) {
		if(MIN_CHANNEL<=channel && channel<=MAX_CHANNEL) {
			prevChannel = this.channel;
			this.channel = channel;
		} else {
			return;
		}
	}
	
	public void setVolume(int volume) {
		if(MIN_VOLUME<=volume && volume <=MAX_VOLUME) {
			this.volume = volume;
		} else {
			return;
		}
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}