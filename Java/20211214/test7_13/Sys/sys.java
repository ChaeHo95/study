package test7_13.Sys;

import test7_13.command.Command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class sys {
    Scanner sc = new Scanner(System.in);
    public void programming(String[] command) {
        ArrayList<Command> arl = new ArrayList<Command>();
        isItNum is = new isItNum();
        boolean program = true;
        while (program) {
            System.out.print(">> ");
            String st = sc.nextLine();
            String[] stArray = st.split(" ");
            if (stArray[0].equals("exit")) {
                program = false;
            }
            if (stArray[0].equals("go")) {
                go(arl);
                continue;
            }
            if(stArray[0].equals(command[0])){
                if(!is.itnum(stArray[2])){
                    System.out.println("변수 생성 및 값 저장 시 값은 정수로 입력해주세요.");
                    continue;
                }
            }
            if (stArray.length != 3) {
                System.out.println("명령어 입력 방식이 잘 못 되었습니다.");
                System.out.println("다시 입력 부탁드립니다.");
                continue;
            }
            for (int i = 0; i < stArray.length; i++) {
                stArray[i].toLowerCase().trim();
            }
            int nemu = -1;
            for (int i = 0; i < command.length; i++) {
                if (stArray[0].equals(command[i])) {
                    arl.add(new Command(stArray[0], stArray[1], stArray[2]));
                    nemu++;
                    break;
                }
            }
            if (nemu == -1) {
                System.out.println("존재 하지 않는 명령어를 입력하셨습니다.");
                continue;
            }
        }

    }

    public void go(ArrayList<Command> arl) {
        sysCommand sysc = new sysCommand();
        String[] command = {"mov", "add", "sub", "jn0", "prt"};
        for (int i = 0; i < arl.size(); i++) {
            int co = 0;
            for (int j = 0; j < command.length; j++) {
                if (arl.get(i).getCommand().equals(command[j])) {
                    switch (j) {
                        case 0:
                            sysc.mov(arl, i);
                            co++;
                            break;
                        case 1:
                            sysc.add(arl, i);
                            co++;
                            break;
                        case 2:
                            sysc.sub(arl, i);
                            co++;
                            break;
                        case 3:
                            i = sysc.jn0(arl, i);
                            co++;
                            break;
                        case 4:
                            sysc.prt(arl, i);
                            co++;
                            break;
                    }
                    if (co==1){
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < sysc.size(); i++) {
            if (sysc.hm.get(0)==null){
                continue;
            }
            if (sysc.hm.get(0)!=null && i==0){
                System.out.print(sysc.toString(i)+"\n");
            }
            else if(sysc.hm.get(0)!=null){
            System.out.print(sysc.toString(i)+"\t");
            }
        }
        arl.clear();
        System.out.println();
        System.out.printf("출력할 결과는 %d, 프로그램 실행 종료",sysc.hm.get(1).getValue());
        sysc.preIndex = 1;
        System.out.println();
    }
}
