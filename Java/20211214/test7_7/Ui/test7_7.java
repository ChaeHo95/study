package test7_7.Ui;

import test7_7.Student.Student;

import java.util.HashMap;
import java.util.Scanner;

public class test7_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> hm = new HashMap<String, Student>();
        System.out.println("미래장학금관리시스템입니다.");

        int n = 0;
        try {
            for (int i = n; i < 5; i++) {
                System.out.print("이름과 학점 >>");
                String st = sc.nextLine();
                String[] sta = st.split(" ");
                hm.put(sta[0], new Student(sta[0].trim(), Double.parseDouble(sta[1].trim())));

            }
            System.out.print("장학생 선발 학점 기준 입력 >> ");
            double note;
            while (true){
            note = sc.nextDouble();
            if(note < 4.5){ break;}
            else {
                System.out.println("최대 학점은 4.5입니다.");
            }
            }
            System.out.print("장학생 명단>>");
            for (String key : hm.keySet()) {
                if (hm.get(key).getNote() >= note) {
                    System.out.print("\t"+key);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("학점은 정수로 적어주세요.");
            if (n != 0) {
                n--;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("이름과 학점을 띄워서 동시에 적어주세요. ");
            if (n != 0) {
                n--;
            }
        }
    }
}
