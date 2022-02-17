import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("달을 입력하세요(1~12) >>" );
		Scanner scanner = new Scanner(System.in);
		String B;
		
		int A = scanner.nextInt();
		
		if(A > 0 && A < 12) {
			switch (A){
			
				case 12:
					B = "겨울";
					break;
				
				case 11:
				case 10:
				case 9:
					B = "가을";
					break;
				case 8:
				case 7:
				case 6:
					B = "여름";
					break;
				case 5:
				case 4:
				case 3:
					B = "봄";
					break;
				default:
					B = "겨울";
			}
			System.out.println(B);

		}
		else {
			System.out.println("잘못 입력");
		}
	}

}
