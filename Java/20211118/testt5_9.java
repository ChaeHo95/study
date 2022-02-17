import java.util.Scanner;
// 5_9 풀이
interface Stackk{ // stor 저장 // current 현재의 // able 할 수 있는
    int length(); // Number of stacks stored in the current stack
    int capacity(); // Total number of storable stacks
    String pop(); // Returns the real number stored at the top of the stack
    boolean push(String val); //Storing real numbers at the top of the stack
}
class StringStackk implements Stackk{
    private int tos; // stored Stack
    private String[] text; // Stack
    
    public StringStackk(int cap) { // prepare 준비하다
    	text = new String[cap];
    	tos = -1; // Prepare data size to -1
    }

    @Override
    public int length() {
        return tos + 1; // number of stacks stored
    }

    @Override
    public int capacity() {
        return text.length; // Returns the size of an arrat on the stack
    }

    @Override
    public String pop() { // saved stack output
    	if(tos == -1) {
    		return null;
    	}
    	String s = text[tos]; // stack copy
    	tos--; // stack position
        return s; // copied stack output
    }

    @Override
    public boolean push(String val) { // save the stack
    	if(tos == text.length-1) {
    		return false;
    	}
        tos++;
        text[tos] = val;
        return true;
    }
}
public class testt5_9 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter total stack length >> ");
    	int length = sc.nextInt();
        StringStackk stringStack = new StringStackk(length);
        
        while(true) {
        	System.out.println("string input >> ");
        	String st = sc.next();
        	if(st.equals("stop")) {
        		break;
        	}
        	boolean result = stringStack.push(st);
        	if(!result) {
        		System.out.println("stack is full,push not possible.");
        	}
        }
        System.out.println("All strings stored on the stack >> ");
        int len = stringStack.length();
        for(int i = 0; i < len; i++) {
        	System.out.println(stringStack.pop() + " ");
        }
        sc.close();
    }
}