import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src); //�߻� �޼ҵ�
	abstract protected String getSrcString(); // �߻� �޼ҵ�
	abstract protected String getDestString(); // �߻�޼ҵ�	
	protected double ratio; // ����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		sc.close();
	}
}
public class test5_4 extends Converter {
	public test5_4(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src){
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5_4 toMile = new test5_4(1.6); // 1������ 1.6km
		toMile.run();

	}

}
