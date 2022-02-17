import java.util.Scanner;
public class practice4 {

	public static void main(String[] args) {
		System.out.print("점수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int max = scanner.nextInt();
		int mid = scanner.nextInt();
		int min = scanner.nextInt();
		int temp = 0;
		if(max < mid) {
			temp = max;
			max = mid;
			mid = temp;
		}
		if(max < min) {
			temp = max;
			max = min;
			min = temp;
		}
		if(mid < min) {
			temp = mid;
			mid = min;
			min = temp;
		}
		System.out.println("max : " + max+ " mid : " + mid + " min : " + min);

	}

}
