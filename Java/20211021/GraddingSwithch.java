import java.util.Scanner;
public class GraddingSwithch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하시오: ");
		int score = scanner.nextInt();
		
		switch(score/10) {
		case 10: 
		case 9:	
			grade = 'A'; 
			break; //break가 없을 시  계속 밑으로 실행
		case 8: 
			grade = 'B';
			break;
		default:
			grade = 'F';
		
			
		}
	}

}
