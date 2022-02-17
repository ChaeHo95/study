
public class check_Time {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		System.out.println(x);
		return x;
	}
	public check_Time(int x) {
	this.x=x;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_Time a = new check_Time(5);
		int n = a.getX();
		
		System.out.println(a);
		System.out.println(n);
	}

}
