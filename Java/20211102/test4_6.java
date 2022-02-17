package simple;

import java.util.Scanner;

class Circle1{
	static int max;
	private double x, y;
	private int radius;
	public Circle1(double x,double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show() {
		System.out.println("("+ x +","+ y +")"+radius);
	}
	
	public void show1() {
		System.out.println("가장 면적인 큰 원은"+"("+ x +","+ y +")"+radius);
	}
	int getRadius() {
		return radius;
	}
	
}
public class test4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle1 c[] = new Circle1[3];
		for(int i = 0; i< c.length; i++) {
			System.out.print("x,y,radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle1(x,y,radius);
		}
		for(int i =0; i<c.length; i++) {
			c[i].show();
		}
		Circle1 width_max = new Circle1(0, 0, 0);
		
		for(int i = 0; i < c.length; i++) {
			if (c[i].getRadius() > width_max.getRadius()) {
				width_max = c[i];
			}
		}
		width_max.show1();
	
		scanner.close();

	}

}