import java.util.Scanner;
import java.util.StringTokenizer;

public class test6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("입력 하세요 >>");
            String text = sc.nextLine();
            if(text.equals("그만")){
                System.out.println("종료");
                break;
            }
            StringTokenizer st = new StringTokenizer(text, " ");
            System.out.println(st.countTokens());
        }
    }
}
