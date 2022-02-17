package test7_10.Ui;

import test7_10.Sys.Sys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sys sy = new Sys();
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        boolean start = true;
        while (start){
            try {
                System.out.println("삽입(1), 삭제(2), 보기(3), 종료(4)");
                int num = sc.nextInt();
                switch (num){
                    case 1:
                        sy.setting();
                        break;
                    case 2:
                        sy.dele();
                        break;

                    case 3:
                        sy.show();
                        break;
                    case 4:
                        start = false;
                        System.out.println("종료");
                        break;
                    default:
                        System.out.println("1~4번만 입력해주세요");
                        break;
                }
            }
            catch (NumberFormatException e){
                System.out.println("숫자만 입력해주세요.");
                sc.nextLine();
            }
        }
    }
}
