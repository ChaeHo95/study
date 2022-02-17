interface PhoneInterface{ // 인터페이스 선언
	// 상수 필드 선언, public static final 생략가능
	public static final int TIMEOUT = 10000;
	// 추상 메소드, public abstract 생략 가능
	public abstract void sendCall();
	// 추상 메소드, public abstract 생략 가능
	public abstract void receiveCall();
	// default 메소드, public 생략가능
	// 디폴드 메소드
	public default void printLogo() {
		System.out.println("** Phone **");
	};
}
interface MobilePhoneInterface extends PhoneInterface{ // 인터페이스 상속
	void sendSMS();
	void receiveSMS();
}

interface Mp3Interface{ // 인터페이스 선언
	public void play();
	public void stop();
}

class PDA{ // 클래스 선언
	public int calculate(int x, int y) {
		return x+y;
	}
}
// SamrtPhone 클래스는 PDA를 상속받고,
// MobilePgoneInterface와 Mp3Interface 인터페이스에 선언된 추상 메소드를 모두 구현.
class SmartPhone extends PDA implements MobilePhoneInterface, Mp3Interface{
	//MobilePhoneInterface의 추상 메소드 구형
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}
	
	//Mp3Interface의 추상 메소드 구형
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
public class InterfaceEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
		
		
	}

}
