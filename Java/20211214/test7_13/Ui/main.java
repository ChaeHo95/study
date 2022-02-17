package test7_13.Ui;

import test7_13.Sys.sys;
import test7_13.command.Guide;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        Vector<Guide> v = new Vector<Guide>();
        sys sy = new sys();
        String[] command = {"mov", "add", "sub", "jn0", "prt", "go", "exit"};
        for (String keys : command) {
            v.add(new Guide(keys, command));
        }
        System.out.println("수퍼컴이 작동합니다.");
        System.out.println("-----------------------");
        for (int i = 0; i < command.length; i++) {
            System.out.println(v.get(i).getTexts());
        }
        System.out.println("명령어 입력 방식은: \'명령어 변수명 값\'입니다.");
        System.out.println("-----------------------");
        sy.programming(command);
    }
}

