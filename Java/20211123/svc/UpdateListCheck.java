package svc;
import vo.Member;
import java.util.Scanner;

import controller.Check;
import controller.UpdateListDuplicatecheck;



public class UpdateListCheck {
	Scanner sc = new Scanner(System.in);
	Member member = new Member();
	Check checkk = new Check();
	UpdateListDuplicatecheck doplcheck = new UpdateListDuplicatecheck();
	public int[] ListCheck() {
		int[] updateListArray=null;  
		String[] updateList = { "이름", "이메일", "주소", "취미", "전화번호", "나이" };
		int[] temp = new int[updateList.length];  
		String[] strArr;   char[] idArray;
		boolean numcheck = true;   int count = 0; 
		String check = null;
		
		System.out.println("==== 회원 정보 수정====");
		for (int i = 0; i < updateList.length; i++) {
			System.out.printf("%d. %s 정보수정 %n", i + 1, updateList[i]);
		}
		System.out.println("\n입력 방식을 선택해주세요.");
		while (numcheck) {
			System.out.println("\n조건 1) ex)1,4,...\n조건 2) 이름,주소,...");
			int num = Integer.parseInt(checkk.Idcheck("번호 :", sc));
			if(num >0 && num <3){
			System.out.println("수정을 원하시는 부분을 적어주세요.");
			check = sc.nextLine();
			}
			if (num == 1) {
				idArray = check.toCharArray();
				for (int i = 0; i < idArray.length; i++) {
					if ((idArray[i] > '0' && idArray[i] <= '6')) {
						temp[count++] = idArray[i] - '0';
					}
				}numcheck = false;
			} else if (num == 2) {
				strArr = check.split(",");
				for (int i = 0; i < strArr.length; i++) {
					for (int j = 0; j < updateList.length; j++) {
						if (strArr[i].equals(updateList[j])) {
							temp[count++] = j + 1;
						}
					}numcheck = false;
				}
			}
			if(temp[0] == 0) {
				System.out.println("조건에 맞게 적어주세요.");
				numcheck = true;
			}
		}
		updateListArray = doplcheck.duplicatecheck(temp);

		return updateListArray;
	}
}