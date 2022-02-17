import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
//	3개의 정수를 입력받아 합을 구하는 프로그램을 작성하라. 사용자가 정수가 
//	아닌 문자를 입력할 때 발생하는
//	InputMismatchException 예외를 처리하여 다시 입력받도록 하라.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n; // 합하기
		}
		System.out.println("합은 " + sum);
		scanner.close();
	}
}