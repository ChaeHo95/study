package test7_9.Ui;

import test7_9.Mystack.IStack;
import test7_9.Mystack.MyStack;

public class StackManager {
    public static void main(String[] args) {

        IStack<Integer> stack = new MyStack<Integer>();

        for (int i=0; i<10; i++){
            stack.push(i); // 10개의 정수 푸시
        }
        // 스택이 빌 때까지 pop
        while (true){
            Integer n = stack.pop();
            if(n == null){
                break; // 스택이 빈 경우
            }
            System.out.println(n + " ");
        }
    }
}
