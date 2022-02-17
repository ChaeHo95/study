package controller;

import java.util.Scanner;

import svc.Regist;

public class CancelOrContinue{
    Scanner scan = new Scanner(System.in);
    int select = 0;
    boolean cancel = true;
    public boolean cancelOrContinue(){
        boolean tr = true;
        System.out.println("중단 하시겠습니까?");
        while(tr){
        System.out.println("1) 계속 등록(수정) 원하실 1을 입력해주세요. \n2) 종료를 원하실 2를 입력해주세요.");
        select = scan.nextInt();
        switch(select){
            case 1:
                System.out.println("다시 작성해주세요.");
                cancel = true;
                tr = false;
                break;
            case 2:
                System.out.println("중단하겠습니다.");
                Regist.cencleMember.setBool(false);
                cancel = false;
                tr = false;
                break;
            default:
            System.out.println("조건에 맞게 적어주세요.");
            
        }
        }
        return cancel;
    }
}