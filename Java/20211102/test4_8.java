package simple;

import java.util.Scanner;

class Phonebook{
	private String number;
	private String name;
	
	void set(String number, String name) {
		this.number = number;
		this.name = name;
	}
	public String get() {
		return name;
	}
	void show() {
		System.out.println(name + "�� ��ȣ��"+number+"�Դϴ�.");
	}
}

public class test4_8 {
	static Scanner scanner = new Scanner(System.in);
	String number;  String name; int num;
	Phonebook pb[];
	
	public test4_8(int num) {
		this.num = num;
		pb = new Phonebook[num];
		for(int i=0; i<pb.length; i++) {
			pb[i] = new Phonebook();
		}
	}
	void run() {
		for(int i=0; i<pb.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>> ");
			String name = scanner.next();
			String number = scanner.next();
			pb[i].set(number, name);
		}
		System.out.println("����Ǿ����ϴ�....");
		while(true) {
			int x = 0;
			System.out.print("�˻��� �̸�>>");
			String search = scanner.next();
			for(int i =0; i < pb.length; i++) {
				if(search.equals(pb[i].get())) {
					pb[i].show(); 
					x += 1;
					break;
				}
			}
			if(search.equals("�׸�")) {
				System.out.println("�������Դϴ�....");
				break;
				}
			else if(x==0) {
				System.out.println(search + "�� ������� ���� ����Դϴ�..");
			}
		}
	}
	

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.print("�ο� �� >> ");
		int num = scanner.nextInt();
		test4_8 a = new test4_8(num);
		a.run();

	}

}
