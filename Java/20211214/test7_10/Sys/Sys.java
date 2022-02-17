package test7_10.Sys;

import test7_10.Generic.Generic;
import test7_10.Shape.*;

import java.util.Scanner;

public class Sys {
    Scanner sc = new Scanner(System.in);
    Generic<Shape> sp = new Generic<Shape>();

    public void setting() {
        boolean start = true;
        System.out.println("Line(1), Rect(2), Circle(3)");
        while (start) {
            try {
                int num = sc.nextInt();
                switch (num) {
                    case 1:
                        start = false;
                        sp.push(new Line());
                        break;
                    case 2:
                        start = false;
                        sp.push(new Rect());
                        break;
                    case 3:
                        start = false;
                        sp.push(new Circle());
                        break;
                    default:
                        System.out.println("1~3번만 입력 해주세요");
                }
            } catch (NumberFormatException e) {
                System.out.println("정수만 입력해주세요");
                sc.nextLine();
            }
        }
    }

    public void dele() {
        while (true) {
            try {
                System.out.println("삭제할 위치를 적어주세요");
                System.out.printf("%d~%d", 1, sp.Tsize());
                int ind = sc.nextInt() - 1;
                if (ind < 0 || ind > sp.Tsize()) {
                    System.out.println("주어진 값에 적어주세요.");
                    sc.nextLine();
                } else {
                    sp.pop(ind);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("정수만 입력해주세요");
                sc.nextLine();
            }
        }
    }

    public void show() {
        for (int i = 0; i < sp.Tsize(); i++) {
            sp.see(i).paint();
            System.out.print("-->");
        }
        System.out.println();
    }
}
