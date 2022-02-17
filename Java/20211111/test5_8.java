class PositivePoint extends test5_8{
	
	public PositivePoint() {
		super(0,0);
	}
	public PositivePoint(int x, int y) {
		super(x,y);
		if(x < 0 && y < 0) {
			super.move(0,0);
		}
	}
	public void move(int x, int y) {
		if(x > 0 && y > 0){
		super.move(x, y);
		}
	}
	public String toString() {
		String str ="("+ getX() +"," +getY() + ")" +"의 점"; 
		return str;
		
	}
}
public class test5_8 {
	private int x,y;
	public test5_8() {}

	public test5_8(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x; this.y = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "입니다.");
		

	}

}
