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
		System.out.println(name + "의 번호는"+number+"입니다.");
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
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			String name = scanner.next();
			String number = scanner.next();
			pb[i].set(number, name);
		}
		System.out.println("저장되었습니다....");
		while(true) {
			int x = 0;
			System.out.print("검색할 이름>>");
			String search = scanner.next();
			for(int i =0; i < pb.length; i++) {
				if(search.equals(pb[i].get())) {
					pb[i].show(); 
					x += 1;
					break;
				}
			}
			if(search.equals("그만")) {
				System.out.println("종료중입니다....");
				break;
				}
			else if(x==0) {
				System.out.println(search + "은 저장되지 않은 사람입니다..");
			}
		}
	}
	

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.print("인원 수 >> ");
		int num = scanner.nextInt();
		test4_8 a = new test4_8(num);
		a.run();

	}

}
