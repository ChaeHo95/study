import java.util.*;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;} //링크 연결
	public Shape getNext() {return next;}
	public abstract void draw();
}
class Line extends Shape{
	public void draw() { //메소드 오버라이딩s
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Rect");
	}
} 
class Circle extends Shape{
	public void draw() { //메소드 오버라이딩
		System.out.println("Circle");
	}
} 

public class test5_12 {
	static Scanner sc = new Scanner(System.in);
	Shape start, last,obj;
	void push() {
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		String str = sc.next();
		if(str.equals("1")) {
			obj = new Line();
		}
		else if(str.equals("2")) {
			obj = new Rect();
		}
		else if(str.equals("3")) {
			obj = new Circle();
		}
		if(start == null) {
			start = obj;
			last = start;
		}
		else if(start != null) {
			last.setNext(obj);
			last = obj;
		}
		
	}
	void delete() {
		System.out.print("The position of the shape to be deleted >>");
		int num = sc.nextInt()-1;
		
		if(num == 0){
			start = start.getNext();;
		}
		else{
			obj = start;
			for(int i = 1; i<num; num--){
				obj = obj.getNext();
			}
			obj.setNext(obj.getNext().getNext());;
			if(obj.getNext() == null) {
				last = obj;
			}
		}			
	}
	void see() {
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.getNext();
		}
	}
	void finish() {
		System.out.println("beauty을 종료합니다.");
	}
	static void paint(Shape p) {
		p.draw(); // p가 가리키는 객채 내에 오버라이딩된 draw() 호출
				 // 동적바이딩
	}
	public static void main(String[] args) {
		test5_12 st = new test5_12();
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true){
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			String str = sc.next();
			if(str.equals("1")) {
				st.push();
			}
			else if(str.equals("2")) {
				st.delete();
			}
			else if(str.equals("3")) {
				st.see();
			}
			else if(str.equals("4")) {
				st.finish();
				break;
			}
		}
	}

}
