package simple;

class Rectangle{
	int x; int y; int width; int height;
	Rectangle(){}
	Rectangle(int a, int b, int c, int d){
		this.x = a; this.y = b; this.width = c; this.height = d;
	}
	int square() {
		int square = width * height;
		return square;
	}
	
	void show() {
		System.out.println("("+x+","+y+")"+"에서 크기가 "+width+"X"+height+"인 사각형");
	}
	Boolean contains(Rectangle r) {
		if(r.x > x && r.y > y && r.width + r.x < x + width && r.height  + r.y < y + height) {
			return true;
		}
		return false;
	}
}
public class test4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2, 2, 8, 7);
		   Rectangle s = new Rectangle(5, 5, 6, 6);
		   Rectangle t = new Rectangle(1, 1, 10, 10);
		   
		   r.show();
		   System.out.println("s의 면적은 "+s.square());
		   if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		   if(t.contains(s)) System.out.println("t는 s를 포함합니다.");

	}

}
