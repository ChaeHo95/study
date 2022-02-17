package test7_11.hashMap;

import test7_11.Sys.sys;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class hashMap {
    ArrayList<sys> hm = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void insert() {
        while (true) {
            System.out.print(">>>> ");
            String st = sc.nextLine();
            if (st.equals("그만")) {
                break;
            }
            String[] star = st.split(" ");
            if (hm.contains(new sys(star[0],star[1]))) {
                System.out.printf("%s는 이미 있습니다. \n", star[0]);
            } else {
                hm.add(new sys(star[0], star[1]));
            }
        }
    }
    public void Qiuz(){
        Random rd = new Random();
        for (int i=0; i<hm.size();i++){
            int ran = rd.nextInt(hm.size());
            System.out.printf("%s의 수도는? \t",hm.get(ran).getLandName());
            String text = sc.nextLine();
            if (text.equals("그만")){
                System.out.println("퀴즈 종료");
                break;
            }
            if(text.equals(hm.get(ran).getCityName())){
                System.out.println("정답!");
            }else {
                System.out.println("아닙니다!!");
            }
        }
    }
}
