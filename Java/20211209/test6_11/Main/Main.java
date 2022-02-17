package test6_11.Main;

import test6_11.System.Editor;

import java.util.Scanner;

public class Main {
    public static boolean modol = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Editor ed = new Editor();
        System.out.println("문장을 입력해주세요");
        String sb = sc.nextLine();
        System.out.println("명령 방식");
        System.out.println("수정 전 ! 수정 후");

        while (modol) {
            String text = ed.editor(sb);
            if (modol) {
                System.out.println(text);
                sb = text;
            }
        }
    }
}
