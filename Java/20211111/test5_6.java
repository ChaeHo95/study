class ColorPoint1 extends test5_6{
	String color;
	public ColorPoint1() {
		this.color = "black";
	}
	
	public ColorPoint1(int x, int y){
		move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public String toString() {
		String str =color +"색의"+ getX() +"," +getY()+"의 점"; 
		return str;
		
	}
}
public class test5_6 {
	private int x,y;
	

	public void test5_6(){
		this.x = 0; this.y = 0;
	}
	
	public void test5_6(int x, int y) {
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
		ColorPoint1 zeroPoint =new ColorPoint1();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint1 cp =new ColorPoint1(10,10);
		cp.setXY(5,5);
		cp.setColor("red");
		System.out.println(cp.toString() + "입니다.");

	}

}
