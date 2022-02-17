class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class Circle extends Shape {
	protected String name;
	
	public void draw() {
		name = "Circle";
		super.name="Shape";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape b = new Circle();
		b.paint();
	}

}
