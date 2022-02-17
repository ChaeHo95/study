class SutdaCard{
	int num ; // 카드의 숫자, 1~10
	boolean isKwang ; // 광이면 true

	public SutdaCard() {
//		this.num = 1;
//		this.isKwang=true;
		this(1,true);
	}
	public SutdaCard(int num , boolean isKwang){
		this.num =num;
		this.isKwang= isKwang;
	}
	String info() {
//		if(isKwang){
//			return num + "K";
//		}
//		return num+"";
		
		return num+(isKwang ? "K" : "");
		
	}
}
public class practice6_1 { // and practice6_2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
