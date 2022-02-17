import java.util.Scanner;

abstract class Calc{
	abstract int Calculate();
}
 class Math extends Calc{
	int a; int b;
	void setValue(int a, int b) {
		// 피연산자 값을 객체내에 저장
		this.a = a; this.b = b;
	}
	@Override
	int Calculate() {
		return 0;
	}
}
class Add extends Math{
	 int Calculate() {
		// 클래스의 목적에 맞는 연산을 실행하고 결과 리턴
	return a + b;
	}
}
class Sub extends Math{
	int Calculate() {
		// 클래스의 목적에 맞는 연산을 실행하고 결과 리턴
	return a - b;
	}

}
class Mul extends Math{
	int Calculate() {
		// 클래스의 목적에 맞는 연산을 실행하고 결과 리턴
	return a * b;
	}
	
}
class Div extends Math{	
	int Calculate() {
	// 클래스의 목적에 맞는 연산을 실행하고 결과 리턴
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
		
		System.out.println("두 정수와 연산자를 입력하시오>> ");
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

		
		System.out.println("결과>> " + result);
	}

}
