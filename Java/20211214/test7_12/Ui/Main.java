package test7_12.Ui;

import test7_12.Sys.Sys;
import test7_12.Word.WordSys;
import test7_12.Word.Words;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<WordSys> v = new Vector<WordSys>();
        Words ws = new Words();
        Sys sy = new Sys();

        for (int i = 0; i < 10; i++) {
            String[] ke = ws.words(i);
            v.add(new WordSys(ke[0], ke[1]));
        }
        boolean game = true;
        while (game) {
            System.out.println("단어 테스트: 1 단어 삽입: 2 종료: 3");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    sy.test(v);
                    break;
                case 2:
                    sy.insert(v);
                    break;
                case 3:
                    game = false;
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("주어진 값에서 입력해주세요.");
            }
        }
    }
}
