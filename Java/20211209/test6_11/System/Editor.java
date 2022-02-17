package test6_11.System;

import test6_11.Buber.Buber;
import test6_11.Main.Main;

import java.util.Scanner;

public class Editor {
    Scanner sc = new Scanner(System.in);
    Buber bb = new Buber();
    boolean bl = true;
    String[] text;

    public String editor(String sb) {
        String[] stArray = sb.split(" ");
        StringBuffer sbf = new StringBuffer(sb);
        while (bl) {
            System.out.print("명령 >> ");
            text = sc.nextLine().split("!");
            if (text[0].equals("그만")) {
                System.out.println("종료");
                Main.modol = false;
                break;
            }
            else if (text.length == 2) {
                for (int i = 0; i < stArray.length; i++) {
                    if (text[0].equals(stArray[i])) {
                        int[] indexs = bb.index(sb, text[0]);
                        sbf.replace(indexs[0],indexs[1],text[1]);
                        break;
                    }
                    if(i == stArray.length-1){
                        System.out.println("찾을 수 없는 단어입니다.");
                    }
                }
            }
            else{
                System.out.println("잘 못된 명령입니다.");
            }
            sb = String.valueOf(sbf);
            return sb;
        }
        return null;
    }
}


