package simple;

import java.util.Scanner;

public class test4_10 {
	private static String[] kor = {"사랑", "아기","돈", "미래", "희망"};
	private static String[] eng = {"Love", "Baby","Money", "Future", "Hope"};
	
	public static String korToEng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])){
				word = kor[i] + "은 " + eng[i];
				return word;
			}
		}
		word = word + "는 저의 사전에 없습니다.";
		return word;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		test4_10 a = new test4_10();
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
		System.out.print("한글 단어?");
		String str = scanner.next();
		if(str.equals("그만")) {break;}
		System.out.println(a.korToEng(str));
		
		}
	}

}
