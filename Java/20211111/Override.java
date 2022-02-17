class Shape{ //슈퍼클래스
	public Shape next;
	public Shape(){next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() { //메소드 오버라이딩
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
public class Override {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape start,last,obj;
		//링크드 리스트 도형 생성하여 연결
		start = new Line(); //Line 객체연결
		last = start;
		obj = new Rect();
		last.next = obj; // Rect 객체연결
		last = obj;
		obj = new Line();
		last.next = obj; // Line 객체연결
		last = obj;
		obj = new Circle();
		last.next = obj; // Circle 객체연결
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}	

}
