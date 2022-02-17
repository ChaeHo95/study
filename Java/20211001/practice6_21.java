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
		// ispowerOn�� ���� true�� false��, false�� true�� �ٲ۴�
		 isPowerOn = !isPowerOn;
		
	}
	void volumeUp(){
		//volume�� ���� MAX���� ���� ���� ���� 1 ���� 
		if(volume < MAX_VOLUME) {
			volume++;
		}
	}
	void volumeDown(){
		//volume�� ���� MIN���� Ŭ ���� ���� 1����
		if(volume > MIN_VOLUME) {
		volume--;
		}
	}
	void channelUp(){
		//channel�� ���� 1 ����
		// ���� channel�� MAX�� channel�� ���� MIN���� �ٲ�
		channel++;
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
	}
	void channelDown(){
		//channel�� ���� 1 ����
		// ���� channel�� MIN�� channel�� ���� MAX���� �ٲ�
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
