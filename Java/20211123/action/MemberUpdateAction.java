package action;

import java.util.Scanner;

import controller.Check;
import svc.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;

public class MemberUpdateAction implements Action {
	@Override
	public void execute(Scanner scan) {

		ConsoleUtil consoleUtil = new ConsoleUtil();
		Check check = new Check();

		int id = Integer.parseInt(check.Idcheck("수정할 ", scan));
		MemberUpdateService memberUpdateService = new MemberUpdateService();

		Member oldMember = memberUpdateService.getOldMember(id);
		if (oldMember == null) {
			consoleUtil.printDeleteFailMessage(id);
		} else {
			Member newMember = consoleUtil.getNewMember(oldMember, scan);
			boolean updateSuccess = memberUpdateService.updateMember(newMember);
			if (updateSuccess) {
				consoleUtil.printUpdateSuccessMessage(newMember.getId());
			} else {
				consoleUtil.printUpdateFailMessage(newMember.getId());
			}
		}
	}
}