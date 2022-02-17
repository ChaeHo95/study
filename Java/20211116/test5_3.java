import java.util.*;
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
public class test5_3 extends Converter{

	public test5_3(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return src/ratio;
	}
	
	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}
	
	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5_3 toDollar = new test5_3(1200); // 1�޷��� 1200��
		toDollar.run();
	}


}
