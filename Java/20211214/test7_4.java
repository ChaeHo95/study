import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class test7_4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int i = 0;
        while (true){
            try{
            System.out.print("강수량 입력(0 입력시 종료) >>");
            v.add(sc.nextInt());
                if(v.get(i) == 0){
                    System.out.println("종료");
                    break;
                }
                Iterator<Integer> it = v.iterator();
            while (it.hasNext()){
                System.out.printf("%d\t",it.next());
            }
            result += v.get(i);
            i++;
            System.out.println();
            System.out.printf("현재 강수량 >> %d \n",result/v.size());
        }catch (Exception e){
                System.out.println("숫자만 적어주세요");
                sc.nextLine();
                continue;
            }
        }
    }
}
