package test7_5_1.Ui;

import test7_5_1.Student.Stunden;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Stunden> ar = new ArrayList<Stunden>();
        System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");

        for (int i = 0; i < 4; i++) {
            try {
                System.out.print(">>> ");
                String st = sc.nextLine();
                String[] stArray = st.split(",");
                ar.add(new Stunden(stArray[0].trim(), stArray[1].trim(), Integer.parseInt(stArray[2].trim()), Double.parseDouble(stArray[3].trim())));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("학번과 학점은 정수로만 적어주세요.");
                continue;
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            System.out.println("------------------------");
            System.out.print(ar.get(i).toString());
            ;
        }
        while (true) {
            System.out.println("------------------------");
            System.out.println("학생 이름>> ");
            String scc = sc.nextLine();
            if (scc.equals("그만")) {
                System.out.println("종료");
                break;
            }
            int count = 0;
            for (int i = 0; i < ar.size(); i++) {
                if (scc.equals(ar.get(i).getName())) {
                    System.out.println(ar.get(i).totoString());
                    break;
                }
                count++;
            }
            if (count == ar.size() - 1) {
                System.out.println("등록된 학생이 아닙니다.");
            }
        }
    }
}
