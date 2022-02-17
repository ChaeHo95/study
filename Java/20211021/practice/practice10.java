import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번재 원의 중심과 반지름 입력 입력하시오 >> ");
		double X = scanner.nextDouble();
		double Y = scanner.nextDouble();
		double C = scanner.nextDouble();
		System.out.print("두 번재 원의 중심과 반지름 입력 입력하시오 >> ");
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double E = scanner.nextDouble();
		
		double D = (X-A)*(X-A) + (Y-B)*(Y-B);
		if( D <= (C+E)*(C+E) ) {
			System.out.println("("+ A +","+ B + ")"+"는 원들이 겹칩니다.");
			
		}
		else {
			System.out.println("("+ A +","+ B + ")"+"는 원들이 겹치지 않습니다...");
	}

}
}