import java.util.InputMismatchException;
import java.util.Vector;
import java.util.Scanner;

public class test7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int count = 0;
        int max = 0;
        while (true) {
            try {
                if(count == 0){
                System.out.println("정수(-1이 입력되면 입력종료)입력 >> ");
                }
                int num = sc.nextInt();
                if (num == -1) {
                    break;
                }
                v.add(num);
                count++;
            } catch (InputMismatchException e) {
                System.out.println("다시 입력 부탁드립니다.");
                sc.nextLine();
                count = 0;
                max = 0;
                continue;
            }
        }
        for (int i = 0; i < v.size(); i++) {
            if (max < v.get(i)) {
                max = v.get(i);
            }
        }
        System.out.printf("가장 큰 수는 %d", max);
    }
}
