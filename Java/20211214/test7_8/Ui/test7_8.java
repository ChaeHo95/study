package test7_8.Ui;

import test7_8.Person.Person;

import java.util.HashMap;
import java.util.Scanner;

public class test7_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Person> hm = new HashMap<String,Person>();

        System.out.println("** 포인트 관리 프로그램입니다. **");
        while (true){
            System.out.println("이름과 포인트 입력>>");
            String st = sc.nextLine();
            String[] sta = st.split(" ");
            if(sta[0].equals("그만")){
                System.out.println("종료");
                break;
            }
            if(!hm.containsKey(sta[0])) {
                hm.put(sta[0], new Person(sta[0], Integer.parseInt(sta[1])));
            }
            else {
                int sum = hm.get(sta[0]).getPoint();
                hm.put(sta[0], new Person(sta[0], Integer.parseInt(sta[1])+sum));
            }
            for(String key : hm.keySet()){
                System.out.print(hm.get(key).toString());
            }
            System.out.println();
        }
    }
}
