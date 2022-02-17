package simple;

import java.util.Scanner;

class Day{
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�

	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println(work + "�Դϴ�.");
		}
	}

}

public class test4_7 {
	
	Scanner scanner = new Scanner(System.in);
	String work; 
	Day tag[];
	public test4_7(int d) {
		tag = new Day[d];
		for(int j=0; j<tag.length; j++) {
			tag[j] = new Day();
		}

	}

	void run(){
		while(true) {
			System.out.print("����(�Է�: 1 . ����: 2, ������: 3) >>");
			int num = scanner.nextInt();
			if(num == 1) {
				input();
			}
			else if(num == 2) {
				view();
			}
			else if(num == 3) {
				finish();
				break;
				
			}
			else {
				System.out.println("�־��� 1, 2, 3 �߿����� �����ּ���. ");
			}
		}
	}

	int dayy(int i) {
		while(true) {
			System.out.print("��¥(1~30) >>");
			i = scanner.nextInt();
			if(i < 30 && i > 0) {
				return i;
			}
			else {
				System.out.println("��Ȯ�� ��¥�� �����ּ���.");
			}
	}
}

	void input(){
		int a = dayy(0);
		System.out.print("����(��ĭ����) >>");
		work = scanner.next();
		tag[a].set(work);
	}
	void view() {
		int a = dayy(0);
		System.out.print(a + "���� �� ����  ");
		tag[a].show();
	}
	void finish(){
		System.out.println("���α׷��� �����մϴ�.");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̹��� ������ ���� ���α׷�");
		test4_7 a = new test4_7(30);
		
		a.run();
	}

}