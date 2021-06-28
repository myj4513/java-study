package chap7;

public class practice4_TVCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class VCR{
	boolean power;
	int counter = 0;
	void power() { power = !power; }
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class Tv66{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class TVCR extends Tv66 {
	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}