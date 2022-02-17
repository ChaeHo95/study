package test7_11.Ui;
import test7_11.hashMap.hashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hashMap start = new hashMap();
        boolean game = true;
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while (game){
            try {
            System.out.println("입력(1) 퀴즈(2) 종료(3)");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    start.insert();
                    break;
                case 2:
                    start.Qiuz();
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    game = false;
                    break;
                default:
                    System.out.println("1~3번만 입력해주세요.");
            }
        }catch (NumberFormatException e){
                System.out.println("정수로만 입력해주세요");
                sc.nextLine();
            }
        }

    }
}
