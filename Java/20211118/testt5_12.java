import java.util.*;
// 5-12 explanation //  explanation 풀이
abstract class Shape{ // connection 연결
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}  //link connection
	public Shape getNext() {return next;}
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

public class testt5_12 {
	Scanner sc = new Scanner(System.in);
	private String name;
	private Shape start = null, last=null;
	
	public testt5_12(String name) {
		this.name = name;
	}
	public void run() { // insert 끼워 넣다. // Choose 선택하다.
		System.out.printf("Run graphic editor %s %n",name);
		int choice = 0; // This is used to delete, insert, etc.
		int num = 0; // This is for choosing a shape // shape 모양
		while(choice != 4) {
		System.out.print("Insert(1), Delete(2), View All(3), Exit(4) >>");
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
			Shape t = start;
			while(t!=null) {
				t.draw();
				t = t.getNext();
			}
			break;
		case 4:
			System.out.printf("Exit %s",name); break;
		default:
			System.out.println("You can input olny from 1 to 4");
			}
		}
	}
	private void insert(int num) {
		Shape obj = null;
		switch(num){
		case 1: obj = new Line(); break;
		case 2: obj = new Rect(); break;
		case 3: obj = new Circle(); break;
		}
		if(start == null) {
			start = last = obj;		//start = obj;	//last = start;
		}
		else {
			last.setNext(obj);
			last = obj;
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
		}
		else if(cur == last) {
			last = pre;
			last.setNext(null);
		}
		else {
			pre.setNext(cur.getNext());
		}
		return true;
	}
	
	public static void main(String[] args) {
		testt5_12 ge = new testt5_12("beauty");
		ge.run();
	}

}