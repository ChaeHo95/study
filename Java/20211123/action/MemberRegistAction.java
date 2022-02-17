package action;//입력>컨트롤>액션>서비스

import java.util.Scanner;

import svc.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;

public class MemberRegistAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil consoleUtil = new ConsoleUtil();// 객체가 만들어짐
		Member newMember = consoleUtil.getNewMember(sc);// 객체 데이터를 생성시켜줌
		MemberRegistService memberRegistService = new MemberRegistService();

		boolean registSuccess = memberRegistService.registMember(newMember);
		if (registSuccess) {
			consoleUtil.printRegistSuccessMessage(newMember.getId());
		} else {
			consoleUtil.printRegistFailMessage(newMember.getId());
		}

	}
}