package test6_9.Game;

import test6_9.System.system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        system gm = new system();
        System.out.println("가위 바위 보 게임");
        boolean games = true;
        while (games) {
            try {
                System.out.println("1. 가위 2. 바위 3. 보 4. 끝내기");
                int game = sc.nextInt();

                switch (game) {
                    case 1:
                        System.out.println(gm.resultgame(1));
                        break;
                    case 2:
                        System.out.println(gm.resultgame(2));
                        break;
                    case 3:
                        System.out.println(gm.resultgame(3));
                        break;
                    case 4:
                        games = false;
                        System.out.println("종료");
                        break;
                    default:
                        System.out.println("1~4번만 적어주세요.");
                }

            } catch (InputMismatchException e) {
                System.out.println("숫자만 적어주세요.");
                sc.next();
            }
        }
    }
}
