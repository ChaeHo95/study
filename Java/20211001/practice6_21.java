package simple;
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1 ;
	
	void trunOnOff( ){
		// ispowerOn의 값이 true면 false로, false면 true로 바꾼다
		 isPowerOn = !isPowerOn;
		
	}
	void volumeUp(){
		//volume의 값이 MAX보다 작을 때만 값을 1 증가 
		if(volume < MAX_VOLUME) {
			volume++;
		}
	}
	void volumeDown(){
		//volume의 값이 MIN보다 클 떄만 값을 1감소
		if(volume > MIN_VOLUME) {
		volume--;
		}
	}
	void channelUp(){
		//channel의 값을 1 증가
		// 만일 channel이 MAX면 channel의 값을 MIN으로 바꿈
		channel++;
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
	}
	void channelDown(){
		//channel의 값을 1 감소
		// 만일 channel이 MIN면 channel의 값을 MAX으로 바꿈
		channel--;
		if(channel== MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		
	}
} // class MyTv

public class practice6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		

	}

}
