import java.util.Scanner;
public class DivideByZero {
//�� ������ �Է� �޾� �������� �ϰ� ���� ���ϴ� ���α׷� �ڵ��̴�. ����ڰ� ������ ���� 0�� �Է��ϸ�
//	ArithmeticException ���ܰ� �߻��Ͽ� ���α׷��� ���� ����ȴ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������
		
		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = scanner.nextInt(); // ������ �Է�
		System.out.println(dividend+"�� "+ divisor + "�� ������ ���� " +
				dividend/divisor + "�Դϴ�.");
		scanner.close();

	}

}
