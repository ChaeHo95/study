class Sample{
	public int a;
	private int b;
	int c;
}

public class classAccessEX {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.b = 10;
		aClass.c = 10;
		
//		Sample 클래스의 a와 c는 각각 public,
//		dafault 지정자로 선언이 되었으므로, 같은 패키지에
//		속한 AccessEX클래스에 접근 가능
//		
//		b는 private으로 선언이 되었으므로 AccessEX클래스에서
//		접근 불가능

	}

}
