class ColorTV extends test5_1_2{
	int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	void printProperty() {
		System.out.println(getsize() + "��ġ" + color + "�÷�" );
	}
	
}
class IPTV extends ColorTV{
	String ip;
	public IPTV( String ip, int size, int color) {
		super(size,color);
		this.ip = ip;
	}
	void printProperty1() {
		System.out.print("���� IPTV��"+ ip +"�ּ���");
		printProperty(); 
	}
}
public class test5_1_2 {
	private int size;
	public test5_1_2(int size) {
		this.size = size;
	}
	protected int getsize() {
		return size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV myTV = new IPTV("192.1.1.2",32,1024);
		myTV.printProperty1();

	}

}
