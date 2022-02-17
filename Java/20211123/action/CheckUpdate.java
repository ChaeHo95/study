package action;

import java.util.*;
import controller.DuplcateCheck;
import controller.Check;
import svc.UpdateListCheck;
import vo.Member;
public class CheckUpdate {
	Member member = new Member();
	Check checkk = new Check();
	UpdateListCheck updateListCheck = new UpdateListCheck();
	DuplcateCheck duplcateCheck = new DuplcateCheck();
	public Member getNewMember(Member oldMember, Scanner sc) {
		int[] updateListArray; 
		updateListArray = updateListCheck.ListCheck();

		System.out.println("회원 아이디 :" + oldMember.getId());
		member.setId(oldMember.getId());
		
		for(int i=0; i<updateListArray.length;i++) {
			switch(updateListArray[i]) {
			case 1:
				System.out.println("이전 이름: " + oldMember.getName());
				System.out.print("새 회원 이름 :");
				oldMember.setName(sc.next());
				break;
			case 2:
				System.out.println("이전 이메일 : " + oldMember.getEmail());
				System.out.print("새 ");
				oldMember.setEmail(duplcateCheck.emailAndTelDuplcateCheck("이메일 :", sc));
				break;
			case 3:
				System.out.println("이전 주소 :" + oldMember.getAddr());
				System.out.print("새 회원 주소 :");
				oldMember.setAddr(sc.next());
				break;
			case 4:
				System.out.println("이전 취미 :" + oldMember.getHobby());
				System.out.print("새 회원 취미 :");
				oldMember.setHobby(sc.next());
				break;
			case 5:
				System.out.println("이전 전화번호 :" + oldMember.getTel());
				System.out.print("새 ");
				oldMember.setTel(duplcateCheck.emailAndTelDuplcateCheck("전화번호 :", sc));
				break;
			case 6:
				System.out.println("이전 나이 :" + oldMember.getAge());
				System.out.println("새 회원 나이 :");
				oldMember.setAge(Integer.parseInt(checkk.Idcheck("나이 :", sc)));
				break;
			}
			member = oldMember;
		}
		return member;

	}
}
