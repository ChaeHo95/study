
public class Typeconversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i); //b가 int타입으로 자동변환
		System.out.println(10/4); 
		System.out.println(10.0/4); //4가 4.0으로 자동 변환
		System.out.println((char)0x12340041); // char로 변환된 결과 0x0041오서 문자 'A'
		System.out.println((byte)(b+i)); // b+i는 227,16진수 0xE3, 즉 - 29
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);

	}

}
