s
public class CirecleArea {
	public static void main(String[] args) {
		final double PI =3.14; //원주율을 상수로 선언
		// final 을 쓰면 실행 중 값을 변경 불가
		double radius = 10.0; //원의 반지름
		double circleArea = radius*radius*PI;// 원의 면적 계산
		
		// 원의 면적을 화면에 출력한다.
		System.out.println("원의 면적 = " + circleArea);

	}

}
