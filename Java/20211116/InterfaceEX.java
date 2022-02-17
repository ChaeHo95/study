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
class SamsungPhone implements PhoneInterface{ // 인터페이스 구현
	// PhoneInteface의 모든 추상 메소드 구현
	@Override
	public void sendCall() {System.out.println("띠리리리링");}
	@Override
	public void receiveCall() {System.out.println("전화가 왔습니다.");}
	
	// 메소드 추가 작성
	public void flash() {System.out.println("전화기에 불이 켜졌습니다.");}
	
}
public class InterfaceEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
		
		
	}

}
