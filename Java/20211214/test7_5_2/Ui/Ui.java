package test7_5_2.Ui;

import test7_5_2.Student.Stunden;

import java.util.HashMap;
import java.util.Scanner;

public class Ui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Stunden> hm = new HashMap<String, Stunden>();
        System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");

        for (int i = 0; i < 4; i++) {
            try {
                System.out.print(">>> ");
                String st = sc.nextLine();
                String[] stArray = st.split(",");
                hm.put(stArray[0].trim(), new Stunden(stArray[0].trim(), stArray[1].trim(),
                        Integer.parseInt(stArray[2].trim()), Double.parseDouble(stArray[3].trim())));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("학번과 학점은 정수로만 적어주세요.");
                continue;
            }
        }

        for (String key : hm.keySet()) { // keySet() 모든 key를 가진 뽑아 올수 있음.
            System.out.println("------------------------");
            System.out.print(hm.get(key).toString());
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
            for (String key : hm.keySet()) {
                if (scc.equals(key)) {
                    System.out.println(hm.get(key).totoString());
                    break;
                }
                count++;
            }
            if (count == hm.size() - 1) {
                System.out.println("등록된 학생이 아닙니다.");
            }
        }
    }
}

