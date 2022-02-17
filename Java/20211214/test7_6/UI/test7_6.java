package test7_6.UI;

import test7_6.Location.Location;

import java.util.HashMap;
import java.util.Scanner;

public class test7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Location> hm = new HashMap<String, Location>();

        System.out.println("도시, 경도, 위도를 입력하세요");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print(">>> ");
                String st = sc.nextLine();
                String[] sta = st.split(",");
                hm.put(sta[0].trim(), new Location(sta[0].trim(),
                        Integer.parseInt(sta[1].trim()), Integer.parseInt(sta[2].trim())));
            } catch (NumberFormatException e) {
                System.out.println("위도 와 경도는 숫자로만 적어주세요");
                sc.nextLine();
                i--;
            }
        }

        System.out.println("---------------------");
        for (String key : hm.keySet()) {
            System.out.println(hm.get(key).toString());
        }

        System.out.println("---------------------");
        while (true) {
            System.out.println("도시 이름 검색>>");
            String cityname = sc.nextLine();
            if (cityname.equals("그만")) {
                System.out.println("종료");
                break;
            }
            int n = 0;
            for (String key : hm.keySet()) {
                if (key.equals(cityname)) {
                    System.out.println(hm.get(key).toString());
                }
                n++;
            }
            if (n == hm.size() - 1) {
                System.out.printf("%s는 없습니다.", cityname);
            }
        }
    }
}
