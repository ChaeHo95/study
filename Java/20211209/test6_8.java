import java.util.Scanner;

public class test6_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String text = sc.nextLine();
        for(int i=0; i<text.length()+1; i++) {
            System.out.print(text.substring(i, text.length()));
            System.out.println(text.substring(0,i));
        }
    }
}
