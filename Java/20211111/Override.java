class Shape{ //����Ŭ����
	public Shape next;
	public Shape(){next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Rect");
	}
} 
class Circle extends Shape{
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Circle");
	}
} 
public class Override {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape start,last,obj;
		//��ũ�� ����Ʈ ���� �����Ͽ� ����
		start = new Line(); //Line ��ü����
		last = start;
		obj = new Rect();
		last.next = obj; // Rect ��ü����
		last = obj;
		obj = new Line();
		last.next = obj; // Line ��ü����
		last = obj;
		obj = new Circle();
		last.next = obj; // Circle ��ü����
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}	

}
