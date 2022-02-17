package util;

import java.util.Scanner;

import action.CheckUpdate;
import controller.Check;
import vo.Member;
import vo.SearchDate;
import controller.DuplcateCheck;
import svc.Regist;

public class ConsoleUtil {
	Check check = new Check();
	CheckUpdate checkUpdate = new CheckUpdate();
	DuplcateCheck duplcateCheck = new DuplcateCheck();
	Regist regist = new Regist();
	public Member getNewMember(Scanner scan) throws Exception {
		
		return regist.getNewMember(scan);
	}

	public void printRegistSuccessMessage(int id) {
		System.out.printf("아이디 %s인 회원 등록 성공%n", id);
	}
	public void printRegistFailMessage(int id) {
		System.out.printf("아이디 %s인 회원 등록 실패%n", id);
	}

	public void printMemberList(Member[] memberArray) {
		if (memberArray.length == 0) {
			System.out.println("추가된 회원 정보가 없습니다.");
		} else {
			for (int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}

	public Member getNewMember(Member oldMember, Scanner sc) {
		
		return checkUpdate.getNewMember(oldMember, sc);
	}

	public void printUpdateSuccessMessage(int id) {
		System.out.printf("아이디  %s인 회원 정보 수정 성공%n", id);
	}
	public void printUpdateFailMessage(int id) {
		System.out.printf("아이디  %s인 회원 정보 수정 실패%n", id);
	}
	

	public void printDeleteSuccessMessage(int id) {
		System.out.printf("아이디  %s인 회원 정보 삭제 성공%n", id);
	}

	public void printDeleteFailMessage(int id) {
		System.out.printf("아이디  %s인 회원의 정보가 존재하지 않습니다.%n", id);
	}

	public SearchDate getSearchData(Scanner scan) {
		boolean reset = true;
		String searchCondition = null;
		String searchValue = null;// 검색 값
		while(reset){
		System.out.println("검색 조건을 선택하시오.");
		System.out.println("1. 아이디");
		System.out.println("2. 이름");
		System.out.println("검색 조건 :");
		searchCondition = scan.next();// 검색 조건 선택

		if (searchCondition.equals("아이디") || searchCondition.equals("1")) {
			searchValue = check.Idcheck("검색할", scan);
			reset = false;
		} else if (searchCondition.equals("이름") || searchCondition.equals("2")) {
			System.out.println("검색할 이름 :");
			searchValue = scan.next();
			reset = false;
		} else {
			System.out.println("조건에 맞게 입력해주세요.");
		}
	}
		SearchDate SearchDate = new SearchDate();
		// 리턴할 값이 두 개 이므로 리턴할 값을 속성으로 저장할 클래스 설계

		SearchDate.setSearchCondition(searchCondition);
		SearchDate.setSearchValue(searchValue);
		return SearchDate;
	}

	public void printSearchMember(Member member) {
		if (member == null) {
			System.out.println("검색한 결과가 없습니다.");

		} else {
			System.out.printf("아이디: %s(으)로 검색한 결과%n", member.getId());
			System.out.println(member);
		}
	}

	public void printSearchMemberArray(Member[] memberArray) {
		if (memberArray.length == 0) {
			System.out.println("검색한 결과가 없습니다.");
		} else {
			for (int i = 0; i < memberArray.length; i++) {
				if (i == 0) {
					System.out.printf("이름 %s(으)로 검색한 결과%n ", memberArray[0].getName());
				}
				System.out.println(memberArray[i]);
			}
		}
	}
}