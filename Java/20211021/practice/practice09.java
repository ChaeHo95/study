import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력 입력하시오 >> ");
		double X = scanner.nextDouble();
		double Y = scanner.nextDouble();
		double C = scanner.nextDouble();
		System.out.print("점 (x,y) 좌표를 입력하시오 >> ");
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		
		double D = (X-A)*(X-A) + (Y-B)*(Y-B);
		if( D <= C*C ) {
			System.out.println("("+ A +","+ B + ")"+"는 원 안에 있습니다.");
			
		}
		else {
			System.out.println("("+ A +","+ B + ")"+"는 원 안에 없습니다..");

	}

}
}
