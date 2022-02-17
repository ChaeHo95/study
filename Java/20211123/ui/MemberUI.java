package ui;

import java.util.Scanner;

import action.Action;//패키지명.클레스명
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberUpdateAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {
	public static Member[] memberArray = new Member[0];// 객체 배열

	public static void main(String[] args) {

		MemberController memberController = new MemberController();// 객체 생성
		boolean stop = false;
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		do {
			Action action = null;// 요청 처리 객체
			System.out.println("====회원데이터 관리====");
			System.out.println("1.회원 가입");// (create)
			System.out.println("2.회원 목록 보기");// (Read)
			System.out.println("3.회원 정보 수정");// (Update)
			System.out.println("4.회원 정보 삭제");// (Delete)
			System.out.println("5.회원 정보 검색");// (Read)
			System.out.println("6.프로그램 종료");
			System.out.println();

			System.out.println("메뉴 번호:");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				action = new MemberRegistAction();
				break;

			case 2:
				action = new MemberListAction();
				break;

			case 3:
				action = new MemberUpdateAction();
				break;

			case 4:
				action = new MemberDeleteAction();
				break;

			case 5:
				action = new MemberSearchAction();
				break;

			case 6:
				stop = true;
				System.out.println("프로그램 종료");
				break;

			default:
				break;
			}

			if (action != null) {
				memberController.processRequest(sc, action);
			}

		} while (!stop);
	}
}