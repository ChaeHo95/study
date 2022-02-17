package action;

import java.util.Scanner;

import controller.Check;
import svc.MemberDeleteService;
import util.ConsoleUtil;

public class MemberDeleteAction implements Action {
	ConsoleUtil consoleUtil = new ConsoleUtil();
	Check check = new Check();

	@Override
	public void execute(Scanner scan) throws Exception {
		int id = Integer.parseInt(check.Idcheck("삭제할 ", scan));
		MemberDeleteService memberDeleteService = new MemberDeleteService();
		
		boolean deleteSuccess = memberDeleteService.deleteMember(id);

		if (deleteSuccess) {
			consoleUtil.printDeleteSuccessMessage(id);
		} else {
			consoleUtil.printDeleteFailMessage(id);
		}
	}
}