import java.util.Scanner;

abstract class Calc{
	abstract int Calculate();
}
 class Math extends Calc{
	int a; int b;
	void setValue(int a, int b) {
		// �ǿ����� ���� ��ü���� ����
		this.a = a; this.b = b;
	}
	@Override
	int Calculate() {
		return 0;
	}
}
class Add extends Math{
	 int Calculate() {
		// Ŭ������ ������ �´� ������ �����ϰ� ��� ����
	return a + b;
	}
}
class Sub extends Math{
	int Calculate() {
		// Ŭ������ ������ �´� ������ �����ϰ� ��� ����
	return a - b;
	}

}
class Mul extends Math{
	int Calculate() {
		// Ŭ������ ������ �´� ������ �����ϰ� ��� ����
	return a * b;
	}
	
}
class Div extends Math{	
	int Calculate() {
	// Ŭ������ ������ �´� ������ �����ϰ� ��� ����
	return a / b;
}
}

public class test5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Add add = new Add(); 
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		int result = 0;
		
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		int e = scanner.nextInt();
		int f = scanner.nextInt();
		String str = scanner.next(); 
		


		if(str.equals("+")) {
			add.setValue(e, f);
			result = add.Calculate();

		}
		else if(str.equals("-")) {
			sub.setValue(e, f);
			result = sub.Calculate();
		}
		else if(str.equals("*")) {
			mul.setValue(e, f);
			result = mul.Calculate();

		}
		else if(str.equals("/")) {
			div.setValue(e, f);
			result = div.Calculate();

		}

		
		System.out.println("���>> " + result);
	}

}
