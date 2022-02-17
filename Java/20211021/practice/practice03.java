import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		if(A > 0) {
			 System.out.println("오만원권 "+ A/50000 + "매");
			 A = A - 50000*(A/50000);
			 if(A >0) {
				 System.out.println("만원권 "+ A/10000 + "매");
				 A = A - 10000*(A/10000);
				 if(A > 0) {
					 System.out.println("오천원권 "+ A/5000 + "매");
					 A = A - 5000*(A/5000);
					 if(A > 0) {
						 System.out.println("천원권 "+ A/1000 + "매");
						 A = A - 1000*(A/1000);
							if(A > 0) {
								System.out.println("백원 "+ A/100 + "개");
								 A = A - 100*(A/100);
								 if(A > 0) {
									 System.out.println("십원 "+ A/10 + "개");
									 A = A - 10*(A/10);
									 if(A > 0) {
										 System.out.println("일원 "+ A/1 + "개");
								
	}
								 }}}}}}}}
