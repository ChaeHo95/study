import java.util.*;
// 5-12 explanation //  explanation 풀이
abstract class Shape{ // connection 연결
	private Shape next;
	private Shape prev;
	public Shape() {next = null; prev = null;}
	public void setNext(Shape obj) {next = obj;}  //link connection
	public Shape getNext() {return next;}
	public void setPrev(Shape obj) {prev = obj;}  //link connection
	public Shape getPrev() {return prev;}
	public abstract void draw();
}
class Line extends Shape{
	public void draw() { 
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() { 
		System.out.println("Rect");
	}
} 
class Circle extends Shape{
	public void draw() { 
		System.out.println("Circle");
	}
} 

public class doubleLinkedlist {
	Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start = null, last=null;
	
	public doubleLinkedlist(String name) {
		this.name = name;
	}
	public void run() { // insert 끼워 넣다. // Choose 선택하다.
		System.out.printf("Run graphic editor %s %n",name);
		int choice = 0; // This is used to delete, insert, etc.
		int num = 0; // This is for choosing a shape // shape 모양
		int numm = 0; int count = 0; int count1 = 0;
		while(choice != 6) {
		System.out.print("Insert(1), Delete(2), View All(3),Rotation(4),DoubleLinkedlist(5), Exit(6) >>");
		choice = sc.nextInt();
		switch(choice) {
		case 1:// insert()
			System.out.print("Choose, Line(1), Rect(2), Circle(3) >>");
			num = sc.nextInt();
			if(num < 1 || num >3) {
				System.out.println("You can input olny from 1 to 3");
				break;
			}
			insert(num); break;
		case 2: // delete() // position 위치
			System.out.print("The position of the shape to be deleted >>");
			num = sc.nextInt()-1;
			if(!delete(num)) {
				System.out.println("can't delete");
			}
			break;
		case 3: //show()
			count1 = 0;
			Shape t = start;
			while(t!=null) {
				System.out.printf("%d 번째: ",count1+1);
				t.draw();
				t = t.getNext();
				count1++;
			}
			count = count1;
			break;
		case 4: // Rotation
			Shape p = last;
			count1 = count;
			if(p.getPrev() != null ) {
				while(p!=null) {
					System.out.printf("%d 번째: ",count1);
					p.draw();
					p = p.getPrev();
					count1--;
				}
				break;
			}
			System.out.println("It's not a double-linked list now");
			break;
		case 5: // DoubleLinkedlist
			doubleLinkedlist();
			break;
		case 6:
			System.out.printf("Exit %s",name); break;
		default:
			System.out.println("You can input olny from 1 to 6");
			}
		}
	}
	private void insert(int num) { // desired 원하는
		Shape cur,pre; 
		System.out.print("Choose your desired location >>");
		int numm = sc.nextInt()-1;
		Shape obj = null;
		switch(num){
		case 1: obj = new Line(); break;
		case 2: obj = new Rect(); break;
		case 3: obj = new Circle(); break;
		}
		cur = pre = start;
		if(numm == 0 && start != null) {
			obj.setNext(start);
			if(last.getPrev() != null){
				start.setPrev(obj);
			}
			start = obj;
		}
		else if(start == null) {start = last = obj;	}
		else if(numm >0) {
			for (int i = 0; i < numm; i++) {
				pre = cur;
				if(pre == null) { System.out.println("It is out of the input range."); break;}
				cur = cur.getNext();
			}
			
			if(pre != null &&cur == null) {		
				last.setNext(obj);
				if(last.getPrev() != null){
					obj.setPrev(last);		
				}
				last = obj;
			}
			else if(pre != null &&cur != null) {
				obj.setNext(cur);
				pre.setNext(obj);
				if(last.getPrev() != null){
					obj.setPrev(pre);
					cur.setPrev(obj);
				}
			}	
		}
	}

	private boolean delete(int num){ // previous 이전
		Shape cur, pre; // cur: save data now // pre: save previous data 
		cur = pre = start;
		if(start == null) {return false;}
		for(int i = 0; i <num; i++) {
			pre = cur;
			cur = cur.getNext();
			if(cur == null) {return false;}
		}
		if(start == last) {
			start = last = null;
			return true;
		}
		if(cur == start) {
			start = start.getNext();
			if(last.getPrev()!= null){
				cur = cur.getNext();
				cur.setPrev(null);
			}
		}
		else if(cur == last) {
			last = pre;
			last.setNext(null);
			if(last.getPrev() != null){
				last.setPrev(pre.getPrev());
				
			}
		}
		else {
			pre.setNext(cur.getNext());
			if(last.getPrev() != null){
				cur.setPrev(pre.getPrev());
			}
		}
		return true;
	}
	private void doubleLinkedlist() {
		Shape cur,pre;
			cur = pre = start;
			while (cur != null) {
				pre = cur;
				cur = cur.getNext();
				if(cur != null && pre != null) {
					cur.setPrev(pre);
				}
			}
		}
	
	
	public static void main(String[] args) {
		doubleLinkedlist ge = new doubleLinkedlist("beauty");
		ge.run();
	}

}