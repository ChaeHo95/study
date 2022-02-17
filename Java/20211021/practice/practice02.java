import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {

		System.out.print("2자리수 정수 입력(10~99) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		if (A/10 == A%10) {
			System.out.println("Yes! 10의자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의자리와 1의 자리가 달라요.");
		}
	}

}
