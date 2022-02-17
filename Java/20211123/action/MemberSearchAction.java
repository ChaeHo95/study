package action;

import java.util.Scanner;

import controller.Check;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchDate;

public class MemberSearchAction implements Action {
	Check check = new Check();
	SearchDate SearchDate = new SearchDate();
	@Override
	public void execute(Scanner scan) {
		MemberSearchService memberSearchService = new MemberSearchService();
		ConsoleUtil consoleUtil = new ConsoleUtil();
		SearchDate searchData = consoleUtil.getSearchData(scan);
		boolean reset = true;
		while (reset) {
			if (searchData.getSearchCondition().equals("아이디") || searchData.getSearchCondition().equals("1")) {
				Member member = memberSearchService.searchMemberById(searchData.getSearchValue());
				consoleUtil.printSearchMember(member);
				
				if (member != null) {reset = false;}
			}
			if (searchData.getSearchCondition().equals("이름") || searchData.getSearchCondition().equals("2")) {
				Member[] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
				consoleUtil.printSearchMemberArray(memberArray);
				
				if (memberArray.length != 0) {reset = false;}
			}
			if(reset == true ) {
				if (searchData .getSearchCondition().equals("아이디") || searchData .getSearchCondition().equals("1")) {
					String searchValue = check.Idcheck("검색할", scan);
					searchData.setSearchValue(searchValue);
				}
				else if (searchData .getSearchCondition().equals("이름") || searchData .getSearchCondition().equals("2")) {
					System.out.println("검색할 이름 :");
					String searchValue = scan.next();
					searchData.setSearchValue(searchValue);
			}
		}
	}
}
}
