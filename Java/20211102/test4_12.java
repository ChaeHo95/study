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
			System.out.print("����:1 ��ȸ:2 ���:3 ������:4 >> ");
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
				System.out.println("�־��� ��ȣ �߿� �Է� ���ּ���.");
			}
		}
		catch(InputMismatchException e){
			System.out.println("�־��� ���ڸ� �����ּ���.");
			scanner.next();

		}
	}
}
	void inputvip() {
		for(int j=0; j<1; j++) {
			try {
			for(int i=0; i<1; i++) {
				System.out.print("�¼� ���� S: 1 A: 2 B: 3 >> ");
				seat = scanner.nextInt();
				if(seat < 0 || seat > sitz.length) {
					System.out.println("�־��� �¼� ���� �����ϴ�.");
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
				System.out.println("�־��� ���ǿ� �°� �����ּ���.");
				scanner.next();
				j--;
				continue;
		}
	}
}
	void inputname() {
		System.out.print("�̸�>> ");
		name = scanner.next();
	}

	void inputseatnumber() {
		for(int j=0; j<1; j++) {
			try {
				for(int i=0; i<1; i++) {
					System.out.print("�¼���ȣ>> ");
					seatnumber = scanner.nextInt();
					if(seatnumber < 0 || seatnumber > sitz[seat-1].length) {
						System.out.println("�־��� �¼��� ��ȣ�� �����ϴ�.");
						i--;
						continue;
					}
				}
				sitz[seat-1][seatnumber-1].set(name);
			}
			catch(InputMismatchException e){
				System.out.println("�־��� ���ǿ� �°� �����ּ���.");
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
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
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
			System.out.println("�׷� ����� �����ϴ�.");
		}
		else if(noname != 0) {
		System.out.println("������ ��ҵǾ����ϴ�.");
		}
	}
	void finish(){
		System.out.println("<<<���α׷��� �����մϴ�.>>>");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		test4_12 a = new test4_12(10);
		a.run();
	}

}
