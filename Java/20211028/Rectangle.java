import java.util.Scanner;
public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print("사각형의 너비, 높이 >>");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		scanner.close();

	}

}
