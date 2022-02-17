package test7_12.Sys;

import test7_12.Word.WordSys;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Sys {
    Scanner sc = new Scanner(System.in);
    public void test(Vector<WordSys> v) {
        Vector<WordSys> s = new Vector<WordSys>();
        Random rd = new Random();
        try {
            System.out.println("\"명품영어\"의 단어 테스트를 시작합니다.");
            System.out.println("-1을 입력하면 종료합니다.");
            System.out.printf("현재 %d개의 단어가 들어있습니다. \n", v.size());
            while (true) {
                s.removeAllElements();
                int ran = rd.nextInt(v.size());
                System.out.println(v.get(ran).getEng() + "??");
                for (int i = 0; i < 5; i++) {
                    int ra = rd.nextInt(v.size());
                    if (s.size() != 0 && s.contains(v.get(ra))) {
                        i--;
                    } else {
                        s.add(v.get(ra));
                    }
                    if (i == 4 && !s.contains(v.get(ran))) {
                        s.removeAllElements();
                        i = -1;
                    }
                }
                for (int i = 0; i < s.size(); i++) {
                    System.out.printf("(%d)%s ", i + 1, s.get(i).getKor());
                }
                System.out.print(">>");
                int re = 0;
                while (true) {
                    re = sc.nextInt() - 1;
                    if (re == -2){break;}
                    if (re < 0 && re > 5) {
                        System.out.println("주어진 조건에서 적어주세요.");
                    } else {
                        break;
                    }
                }
                if (re == -2) {
                    System.out.println("종료합니다.");
                    break;
                }
                if (v.get(ran).getEng().equals(s.get(re).getEng())) {
                    System.out.println("Excllent!!");
                } else {
                    System.out.println("No!!!!!!");
                }

            }

        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해주세요.");
            sc.nextLine();
        }

    }
    public void insert(Vector<WordSys> v){
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        System.out.println("Ex) Love 사랑");
        while (true){
                System.out.print("영어 한글 입력>> ");
                String st = sc.nextLine();
                String[] sta = st.split(" ");
                if(sta.length > 2 || sta.length <= 1){
                    System.out.println("입력이 잘 못 되었습니다");
                    System.out.println("다시 입력 부탁드립니다.");
                    continue;
                }
                if(sta[0].equals("그만")){
                    System.out.println("단어 삽입을 종료합니다.");
                    break;
                }
                v.add(new WordSys(sta[0].trim(),sta[1].trim()));
                if(v.contains(v.get(v.size()-1))){
                    System.out.println("중복되는 단어입니다.");
                    System.out.println("다시 적어주세요.");
                    v.remove(v.size()-1);
                }
        }
    }
}
