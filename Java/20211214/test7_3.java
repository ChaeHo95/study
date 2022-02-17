import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = new String[2];
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        System.out.println("나라이름 과 인구를 입력하세요.");
        while (true) {
            try {
                System.out.print("나라이름, 인구 >>");
                st = sc.nextLine().split(" ");
                
                if (st[0].equals("그만")) {
                    System.out.println("입력 종료");
                    break;
                }
                int num = Integer.parseInt(st[1]);
                hm.put(st[0],num);
                System.out.println(hm.size());
            }catch (NumberFormatException e){
                System.out.println("인구수는 숫자만 적어주세요.");
                continue;
            }catch (Exception e) {
                System.out.println("나라이름과 인구만 적어주세요.");
                sc.nextLine();
                continue;
            }
        }while (true){
            System.out.print("인구 검색 >>");
            String sn = sc.nextLine();
            if(hm.get(sn) != null){
                System.out.printf("%s의 인구수는 %d \n",sn,hm.get(sn));
            }
            else {
                System.out.println("찾을 수 없는 값입니다.");
            }
        }
    }
}
