package simple;

import java.util.Scanner;

class Grade{
	private int math;
	private int science;
	private int english;
	Grade(int math,int science,int english ){
		this.math = math;
		this.science = science;
		this.english = english;
		
	}
	double average() {
		int sum = math+science+english;
		double average = sum/3;
		return average;
	}
}
public class test4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("����� " + me.average());
		
		scanner.close();

	}

}
