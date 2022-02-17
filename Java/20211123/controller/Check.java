package controller;

import java.util.*;

public class Check {
	Scanner sc = new Scanner(System.in);

	public String Idcheck(String msgKind, Scanner scan) {
		String id = null;
		int count = 0;
		while (count == 0) {
			if (msgKind.equals("아이디 :") || msgKind.equals("나이 :")) {
				System.out.println("회원 " + msgKind);
				}
			else if(msgKind.equals("번호 :")) {
				System.out.print("조건 " + msgKind);
			}
			else {
				System.out.println(msgKind + " 아이디 : ");
			}
			id = sc.next();
			char[] idArray = id.toCharArray();
			for (int i = 0; i < idArray.length; i++) {
				if (!(idArray[i] >= '0' && idArray[i] <= '9')) {
					if (msgKind.equals("나이 :")) {
						System.out.println("나이는 숫자로만 이루어져 있습니다.");
					} 
					else if(msgKind.equals("번호 :")) {
						System.out.println("조건번호는 숫자로만 적어주세요.");
					}
					else {
						System.out.println("아이디는 숫자로만 이루어져 있습니다.");
					}
					count = 0;
					break;
				}
				count++;
			}
		}
		return id;
	}
}
