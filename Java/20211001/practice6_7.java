class MyPoint{
	int x; int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	 double getDistance(int x, int y){
		double distance = Math.sqrt(((this.x-x)*(this.x-x))
				+((this.y-y)*(this.y-y)));
		return distance;
	}
}
public class practice6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint P = new MyPoint(1,1);
		System.out.println(P.getDistance(2,2));

	}

}
