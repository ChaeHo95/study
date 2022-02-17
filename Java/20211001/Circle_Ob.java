
public class Circle_Ob {
	int radius;
	public Circle_Ob(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle_Ob ob1 = new Circle_Ob(1);
		Circle_Ob ob2 = new Circle_Ob(2);
		Circle_Ob s;
		
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.radius = " + ob1.radius);
		System.out.println("ob2.radius = " + ob2.radius);

	}

}
