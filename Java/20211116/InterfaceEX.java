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
class SamsungPhone implements PhoneInterface{ // �������̽� ����
	// PhoneInteface�� ��� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {System.out.println("�츮������");}
	@Override
	public void receiveCall() {System.out.println("��ȭ�� �Խ��ϴ�.");}
	
	// �޼ҵ� �߰� �ۼ�
	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
	
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
