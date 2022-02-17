package simple;

import java.util.Scanner;

class Day{
	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work + "입니다.");
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
			System.out.print("할일(입력: 1 . 보기: 2, 끝내기: 3) >>");
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
				System.out.println("주어진 1, 2, 3 중에서만 적어주세요. ");
			}
		}
	}

	int dayy(int i) {
		while(true) {
			System.out.print("날짜(1~30) >>");
			i = scanner.nextInt();
			if(i < 30 && i > 0) {
				return i;
			}
			else {
				System.out.println("정확한 날짜를 적어주세요.");
			}
	}
}

	void input(){
		int a = dayy(0);
		System.out.print("할일(빈칸없이) >>");
		work = scanner.next();
		tag[a].set(work);
	}
	void view() {
		int a = dayy(0);
		System.out.print(a + "일의 할 일은  ");
		tag[a].show();
	}
	void finish(){
		System.out.println("프로그램을 종료합니다.");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이번달 스케쥴 관리 프로그램");
		test4_7 a = new test4_7(30);
		
		a.run();
	}

}