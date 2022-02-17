import java.util.Scanner;
public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 연산할 첫번째 수>> ");
		double a = scanner.nextDouble();
		System.out.print("( + 더하기, - 빼기, * 곱하기, / 나누기) 연산 등호>> ");
		String op = scanner.next();
		System.out.print(" 연산할 두번째 수>> ");
		double b = scanner.nextDouble();
		if(op.equals("+")) {
			System.out.println(a+op+b+"의 계산 결과는 "+ (int)(a+b));
		}
		else if(op.equals("-")) {
				System.out.println(a+op+b +"의 계산 결과는 "+ (int)(a-b));
		}
		else if(op.equals("*")) {
			System.out.println(a+op+b +"의 계산 결과는 "+ (int)(a*b));
		}
		else if(op.equals("/")) {
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else{
				System.out.println(a+op+b +"의 계산 결과는 "+ (a/b));
			}
	}
		

	}

}
