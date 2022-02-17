import java.util.Scanner;
public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 (x,y) 좌표를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
		if( X > 100 && X < 200 && Y > 100 && Y < 200) {
			System.out.println("("+ X +","+ Y + ")"+"는 사각형 안에 있습니다.");
			
		}
		else {
			System.out.println("("+ X +","+ Y + ")"+"는 사각형 안에 없거나 벗어 났습니다..");
		}
	}

}
