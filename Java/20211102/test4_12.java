package simple;

import java.util.InputMismatchException;
import java.util.Scanner;

class seat{
	private String name; 

	public void set(String name) {
		this.name = name;
	}
	public String get() {
		return name;
	}
	public void show() {
		if(name == null) {
			System.out.print("---  ");
		}
		else {
			System.out.print(name + "  ");
		}
	}

}


public class test4_12 {
	Scanner scanner = new Scanner(System.in);
	int seat; String name;
	int number;int seatnumber;
	seat sitz[][]; String [] vip = {"S", "A", "B"};
	public  test4_12(int a) {
		sitz = new seat[3][a];
		for(int i=0; i<sitz.length; i++) {
			for(int j=0; j<sitz[i].length; j++) {
				sitz[i][j] = new seat();
			}
		}
	}
	void run() {
		while(true) {
			try {
			System.out.print("예약:1 조회:2 취소:3 끝내기:4 >> ");
			int num = scanner.nextInt();
			if(num == 1) {
				inputvip();
				inputname();
				inputseatnumber();
			}
			else if(num == 2) {
				view();
			}
			else if(num == 3) {
				cancel();
			}
			
			else if(num == 4) {
				finish();
				break;
			}
			else {
				System.out.println("주어진 번호 중에 입력 해주세요.");
			}
		}
		catch(InputMismatchException e){
			System.out.println("주어진 숫자만 적어주세요.");
			scanner.next();

		}
	}
}
	void inputvip() {
		for(int j=0; j<1; j++) {
			try {
			for(int i=0; i<1; i++) {
				System.out.print("좌석 구분 S: 1 A: 2 B: 3 >> ");
				seat = scanner.nextInt();
				if(seat < 0 || seat > sitz.length) {
					System.out.println("주어진 좌석 줄이 없습니다.");
					i--;
					continue;
				}
			}
			System.out.print(vip[seat-1] + ">> ");
			for(int i=0; i<sitz[seat-1].length; i++) {
				sitz[seat-1][i].show();
				}
			System.out.println();
		}
			catch(InputMismatchException e){
				System.out.println("주어진 조건에 맞게 적어주세요.");
				scanner.next();
				j--;
				continue;
		}
	}
}
	void inputname() {
		System.out.print("이름>> ");
		name = scanner.next();
	}

	void inputseatnumber() {
		for(int j=0; j<1; j++) {
			try {
				for(int i=0; i<1; i++) {
					System.out.print("좌석번호>> ");
					seatnumber = scanner.nextInt();
					if(seatnumber < 0 || seatnumber > sitz[seat-1].length) {
						System.out.println("주어진 좌석의 번호가 없습니다.");
						i--;
						continue;
					}
				}
				sitz[seat-1][seatnumber-1].set(name);
			}
			catch(InputMismatchException e){
				System.out.println("주어진 조건에 맞게 적어주세요.");
				scanner.next();
				j--;
				continue;
				}
			
			}
	}
	void view() {
		for(int i=0; i< sitz.length; i++) {
			System.out.print(vip[i] + ">> ");
			for(int j=0; j<sitz[i].length; j++) {
				sitz[i][j].show();
			}
		System.out.println();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	void cancel() {
		int noname = 0;
		inputvip();
		inputname();
		for(int i=0; i<sitz[seat-1].length; i++) {
			String adc = sitz[seat-1][i].get();
				if(name.equals(adc)) {
					sitz[seat-1][i].set(null);
					noname++ ;
					break;
					}
				}
		if(noname == 0) {
			System.out.println("그런 사람은 없습니다.");
		}
		else if(noname != 0) {
		System.out.println("예약이 취소되었습니다.");
		}
	}
	void finish(){
		System.out.println("<<<프로그램을 종료합니다.>>>");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		test4_12 a = new test4_12(10);
		a.run();
	}

}
