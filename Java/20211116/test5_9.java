import java.util.*;

interface Stack{
    int length(); // 현재스택에 저장된 개수 리턴
    int capacity(); // 스택의 전체 저장가능한 개수 리턴
    String pop(); // 스택의 톱(top)에  실수 저장
    boolean push(String val); //스택의 톱(top)에 저장된 실수 리턴
}
class StringStack implements Stack{
    Scanner sc = new Scanner(System.in);
    private int num; // 저장 가능한 개수
    private int set = 0; // 저장된 인덱스
    private String[] text; // 스택의 저장공간

    @Override
    public int length() {// 현재스택에 저장된 개수 리턴
        return set; // 지금까지 저장한  스택 개수
    }

    @Override
    public int capacity() {// 스택의 전체 저장가능한 개수 리턴
        System.out.print("총 스택 저장 공간의 크기 입력 >>");
        int capacity = sc.nextInt(); //  스택의 태열의 크기 설정
        this.num = capacity;
        return capacity; //  스택의 배열 크기 리턴
    }

    @Override
    public String pop() {// 스택의 톱(top)에  실수 저장
            int count = length();
            System.out.print("문자열 입력 >> ");
            String pop = sc.next();
            if(!pop.equals("그만")) {
                for(int j=0; count>j; count--) {
                     text[count]=text[count-1];
                 }
            text[0] = pop;
            }
        return pop;
    }

    @Override
    public boolean push(String val) {//스택의 톱(top)에 저장된 실수 리턴
        if(val.equals("그만")) {
            System.out.print("스택에 저장된 모든 문자열 팝 : ");
            for (int j =0; j< text.length; j++) {
                if(text[j] == null) {
                    continue;
                }
                System.out.printf("%s ",text[j]);
                    }
            return true;
        }
        return false;
    }
    void run() {
        text = new String[capacity()];
        while(true) {
            if(push(pop())) {break;}
            if(length() == num) {
                System.out.println("스택이 꽉 차서 푸시 불가능!!");
                continue;
                }
            this.set += 1;
            }
        }
}
public class test5_9 {
    public static void main(String[] args) {

        StringStack stringStack = new StringStack();
        stringStack.run();

        }
}
