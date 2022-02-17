import java.util.Scanner;
public class practice5 {

	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(B + C > A + B && A + C > A + B && A + B > C) 
			System.out.println("삼각형이 됩니다.");
		
		else if(A + C > B + C && A + B >  B + C && C + B > A) 
			System.out.println("삼각형이 됩니다.");
		
		else if(B + A > A + C && B + C > A + C && A + C > B) 
			System.out.println("삼각형이 됩니다.");
		
		else 
			System.out.println("삼각형이 되지않습니다.");
			
			
		}

	}


