package controller;

import java.util.*;

import action.Action;

public class MemberController {

	public void processRequest(Scanner sc, Action action) {
		try {
			action.execute(sc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// e.getMessage() : 에러의 원인을 간단하게 출력합니다.

// e.toString() : 에러의 Exception 내용과 원인을 출력합니다.

// e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.

