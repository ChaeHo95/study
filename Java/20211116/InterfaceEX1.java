interface PhoneInterface{ // �������̽� ����
	// ��� �ʵ� ����, public static final ��������
	public static final int TIMEOUT = 10000;
	// �߻� �޼ҵ�, public abstract ���� ����
	public abstract void sendCall();
	// �߻� �޼ҵ�, public abstract ���� ����
	public abstract void receiveCall();
	// default �޼ҵ�, public ��������
	// ������ �޼ҵ�
	public default void printLogo() {
		System.out.println("** Phone **");
	};
}
interface MobilePhoneInterface extends PhoneInterface{ // �������̽� ���
	void sendSMS();
	void receiveSMS();
}

interface Mp3Interface{ // �������̽� ����
	public void play();
	public void stop();
}

class PDA{ // Ŭ���� ����
	public int calculate(int x, int y) {
		return x+y;
	}
}
// SamrtPhone Ŭ������ PDA�� ��ӹް�,
// MobilePgoneInterface�� Mp3Interface �������̽��� ����� �߻� �޼ҵ带 ��� ����.
class SmartPhone extends PDA implements MobilePhoneInterface, Mp3Interface{
	//MobilePhoneInterface�� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}
	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���ڿԾ��.");
	}
	
	//Mp3Interface�� �߻� �޼ҵ� ����
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	// �߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}
public class InterfaceEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 5));
		phone.schedule();
		
		
	}

}
