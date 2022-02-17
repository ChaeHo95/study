package controller;

import java.util.*;
import vo.Member;
import ui.MemberUI;
import svc.MemberUpdateService;

// 아이디 , 전화번호, 이메일 중북체크
public class DuplcateCheck {
    Member idCheck = new Member();
    Check checkk = new Check();
    CancelOrContinue cancel = new CancelOrContinue();
    boolean check = true;
    String temp = null;
    int id = 0;

    public int IdDuplcateCheck(String msgKind, Scanner scan) {
        while (true) {
            check = false;
            id = Integer.parseInt(checkk.Idcheck(msgKind, scan));
            idCheck.setId(id);
            if (MemberUI.memberArray.length == 0) {
                return id;
            }
            for (int i = 0; i < MemberUI.memberArray.length; i++) {
                if (idCheck.getId() == MemberUI.memberArray[i].getId()) {
                    System.out.println("이미 생성된 아이디입니다.");
                    check = cancel.cancelOrContinue();
                    break;
                }
            }
            if (check == false) {
                return id;
            }
        }
    }

    public String emailAndTelDuplcateCheck(String msgKind, Scanner scan) {
        while (true) {
            check = false;
            System.out.println("회원 " + msgKind);
            temp = scan.next();
            if (msgKind.equals("이메일 :")) {
                idCheck.setEmail(temp);
            } else if (msgKind.equals("전화번호 :")) {
                idCheck.setTel(temp);
            }

            if (MemberUI.memberArray.length == 0) {
                return temp;
            }
            for (int i = 0; i < MemberUI.memberArray.length; i++) {
                if (msgKind.equals("이메일 :")) {
                    idCheck.setEmail(temp);
                    if (idCheck.getEmail().equals(MemberUI.memberArray[i].getEmail())) {
                        if (MemberUpdateService.oldIdMembercheck.getId() == MemberUI.memberArray[i].getId()) {
                            System.out.println("고객님께서 등록하셨던 이메일입니다.");
                            check = cancel.cancelOrContinue();
                        } else {
                            System.out.println("이미 등록된 이메일입니다.");
                            check = cancel.cancelOrContinue();
                        }
                        break;
                    }
                }
                if (msgKind.equals("전화번호 :")) {
                    idCheck.setTel(temp);
                    if (idCheck.getTel().equals(MemberUI.memberArray[i].getTel())) {
                        if (MemberUpdateService.oldIdMembercheck.getId() == MemberUI.memberArray[i].getId()) {
                            System.out.println("고객님께서 등록하셨던 전화번호입니다.");
                            check = cancel.cancelOrContinue();
                        } else {
                            System.out.println("이미 등록된 전화번호입니다.");
                            check = cancel.cancelOrContinue();
                        }
                        break;
                    }
                }
            }
            if (check == false) {
                return temp;
            }
        }
    }
}
