
public class practice5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE: java Exercies5_7 3120");
			System.exit(0);
		}
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10} ; //동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전 개수
		
		for(int i=0; i<coinUnit.length;i++) {
			int coinNum = 0;
			coinNum = money/coinUnit[i];
			if(coinNum > coin[i]) {
				coin[i] -= 5;
				money = money - (coinUnit[i]*5);
				System.out.println(coinUnit[i] + "원 : " +  5  + "개 ");
			} 
			else {
			coin[i] = coin[i] - coinNum;
			money = money - (coinUnit[i]*coinNum);
			System.out.println(coinUnit[i] + "원 : " + coinNum  + "개 ");
			}
			
			
}	
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
			System.out.println("=남은 동전의 개수=");
			
			for(int i=0; i<coinUnit.length;i++) {
				System.out.println(coinUnit[i] + "원" + coin[i]+"개");
			}
			
		}

	}

