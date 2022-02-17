import java.util.*;

class SutdaDeck{
	Random rd= new Random();
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			cards[i] = new SutdaCard(i%10+1,false);
			if(i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i+1,true);
			}
		}
	}
	
		void shuffle() {
			SutdaCard pre = null;
			for(int i=0; i < cards.length; i++) {
				int a = rd.nextInt(20);
				pre = cards[i];
				cards[i] = cards[a];
				cards[a] = pre;
			}
		}
		public SutdaCard pick(int num) {
			return cards[num];
		}	
		public SutdaCard pick() {
			return cards[rd.nextInt(20)];
		}
}
class SutdaCard{
	private int num;
	private boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num,boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	// info() 대신 Object클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num + (isKwang? "K":"");
	}
}
public class Exercise7_1_2_14{

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+" ");
		}
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
