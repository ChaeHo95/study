import java.util.*;

interface Stack{
    int length(); // ���罺�ÿ� ����� ���� ����
    int capacity(); // ������ ��ü ���尡���� ���� ����
    String pop(); // ������ ��(top)��  �Ǽ� ����
    boolean push(String val); //������ ��(top)�� ����� �Ǽ� ����
}
class StringStack implements Stack{
    Scanner sc = new Scanner(System.in);
    private int num; // ���� ������ ����
    private int set = 0; // ����� �ε���
    private String[] text; // ������ �������

    @Override
    public int length() {// ���罺�ÿ� ����� ���� ����
        return set; // ���ݱ��� ������  ���� ����
    }

    @Override
    public int capacity() {// ������ ��ü ���尡���� ���� ����
        System.out.print("�� ���� ���� ������ ũ�� �Է� >>");
        int capacity = sc.nextInt(); //  ������ �¿��� ũ�� ����
        this.num = capacity;
        return capacity; //  ������ �迭 ũ�� ����
    }

    @Override
    public String pop() {// ������ ��(top)��  �Ǽ� ����
            int count = length();
            System.out.print("���ڿ� �Է� >> ");
            String pop = sc.next();
            if(!pop.equals("�׸�")) {
                for(int j=0; count>j; count--) {
                     text[count]=text[count-1];
                 }
            text[0] = pop;
            }
        return pop;
    }

    @Override
    public boolean push(String val) {//������ ��(top)�� ����� �Ǽ� ����
        if(val.equals("�׸�")) {
            System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
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
                System.out.println("������ �� ���� Ǫ�� �Ұ���!!");
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
