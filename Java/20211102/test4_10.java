package simple;

import java.util.Scanner;

public class test4_10 {
	private static String[] kor = {"���", "�Ʊ�","��", "�̷�", "���"};
	private static String[] eng = {"Love", "Baby","Money", "Future", "Hope"};
	
	public static String korToEng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])){
				word = kor[i] + "�� " + eng[i];
				return word;
			}
		}
		word = word + "�� ���� ������ �����ϴ�.";
		return word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		test4_10 a = new test4_10();
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
		System.out.print("�ѱ� �ܾ�?");
		String str = scanner.next();
		if(str.equals("�׸�")) {break;}
		System.out.println(a.korToEng(str));
		
		}
	}

}
