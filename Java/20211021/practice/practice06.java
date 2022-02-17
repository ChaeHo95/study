import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2자리수 정수 입력(10~99) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		if(A%10 == 3|| A%10 == 6|| A%10 == 9) {
			System.out.print("박스 짝");
			
			if (A/10 == A%10 ) {
				System.out.println("짝");
		}

			
		}
		else if(A/10 == 3|| A/10 == 6|| A/10 == 9) {
			System.out.print("박스 짝");
			
			if (A/10 == A%10 ) {
				System.out.println("짝");
		}
			
		}
		else {
			System.out.println(A);
		}
	}

	}



