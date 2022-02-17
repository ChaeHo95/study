class ColorPoint extends test5_5{
	String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color =color;
	}
	void  setColor(String color) {
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
public class test5_5 {
	private int x,y;
	public test5_5(int x, int y){
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
		ColorPoint cp =new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
