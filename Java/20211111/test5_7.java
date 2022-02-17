class Point3D extends test5_7{
	int z;
	public Point3D(int x, int y,int z) {
		super(x,y);
		this.z = z;
	}
	
	void moveUp(){
		z++;
	}
	void moveDown(){
		z--;
	}
	public void move(int x, int y,int z) {
		move(x, y);
	}
	public String toString() {
		String str ="("+ getX() +"," +getY()+","+ z + ")" +"의 점"; 
		return str;
		
	}
}
public class test5_7 {
	private int x,y;
	
	public test5_7(int x, int y) {
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
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10,10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString() + "입니다.");
	}

}
