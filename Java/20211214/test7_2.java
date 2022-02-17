import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();

        int count = 0;
        while (count++ < 6) {
            try {
                if (count == 1) {
                    System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
                }
                String note = sc.next().toUpperCase();
                char pt = note.charAt(0);
                if(pt == 'E'){
                    count = 0;
                    System.out.println("(A/B/C/D/F)만 입력가능합니다.");
                    sc.nextLine();
                    continue;
                }
                if (pt == 'F'){
                    pt = 'E';
                }
                if (pt >= 'A' && pt <= 'E') {
                    a.add(String.valueOf(pt));
                }
                else {
                    count = 0;
                    System.out.println("(A/B/C/D/F)만 입력가능합니다.");
                    sc.nextLine();
                    continue;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        int result = 0;
        int punk = 0;
        for(int j='E'; j>'A'-1; j--) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).equals(String.valueOf((char)j))) {
                    result += punk;
                }
            }
            punk++;
        }
        System.out.println((double)result/(double)a.size());
    }
}
