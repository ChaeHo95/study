
public class ForSamlpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// 변수 i는 for문을 벗어나서 사용할수 없음
		for(int i=1; i<=10; i++) {// 1~10까지 반복
			sum += i;
			System.out.println(i); // 더하는 수 출력
			
			if(i<=9)// 1~9까지는 '+'출력
				System.out.println("+");
			else {  // i가 10인경우
				System.out.println("="); // '='출력하고
				System.out.println(sum); // 덧셈 결과 출력
			}
		}

	}

}
