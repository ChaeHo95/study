
public class practice5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680; int c = 0;
		System.out.println("money = " + money);
		
		for(int i=0; i<coinUnit.length;i++) {
			if(coinUnit[i]<money) {
				c = money/coinUnit[i];
				System.out.println(coinUnit[i] + "¿ø : " + c + "°³");
				money -= coinUnit[i]*c ;
				c = 0;
			}
		}
	}

}
