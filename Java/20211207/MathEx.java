
public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI); // 원주율 상수 출력
		System.out.println(Math.ceil(3.14));// ceil(올림)
		System.out.println(Math.floor(3.14)); // floor(내림)
		System.out.println(Math.sqrt(9)); // 제곱근
		System.out.println(Math.exp(2)); // e의 2승
		System.out.println(Math.round(3.14)); // 반올림
		
		// [1, 45] 사이의 정수형 난수 5개 발생
		for(int i=0; i<5; i++) {
		 System.out.print((int)(Math.random()*45+1) + " "); // 난수 발생
		}
	}

}
