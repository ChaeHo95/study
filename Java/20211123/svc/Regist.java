package svc;

import vo.Member;
import java.util.Scanner;
import action.CheckUpdate;
import controller.Check;
import controller.DuplcateCheck;

public class Regist {
    Check check = new Check();
    CheckUpdate checkUpdate = new CheckUpdate();
    DuplcateCheck duplcateCheck = new DuplcateCheck();
    public static Member cencleMember;
    public Member getNewMember(Scanner scan) throws Exception {
        Member newMember = new Member();
        cencleMember = newMember;
        cencleMember.setBool(true);
        boolean regist = true;
        int i = 1;
        while (regist) {
            if(cencleMember.getBool()){
            switch (i) {
                case 1:
                    newMember.setId(duplcateCheck.IdDuplcateCheck("아이디 :", scan));
                    break;
                case 2:
                    newMember.setName(all("이름 : ", scan));
                    break;
                case 3:
                    newMember.setEmail(duplcateCheck.emailAndTelDuplcateCheck("이메일 :", scan));
                    break;
                case 4:
                    newMember.setAddr(all("주소 : ", scan));
                    break;
                case 5:
                    newMember.setHobby(all("취미 : ", scan));
                    break;
                case 6:
                    newMember.setTel(duplcateCheck.emailAndTelDuplcateCheck("전화번호 :", scan));
                    break;
                case 7:
                    newMember.setAge(Integer.parseInt(check.Idcheck("나이 :", scan)));
                    regist = false;
                    break;
            }
        }if(!cencleMember.getBool()){
            regist = false;
        }
            i++;
        }
        return newMember;
    }

    public String all(String msgkind, Scanner scan) {
        System.out.println("회원 " + msgkind);
        return scan.next();
    }
}