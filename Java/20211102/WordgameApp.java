import java.util.Scanner;

class Player{
	String name;
	String word;
	public Player() {
	}
	public Player(String name) {
		this.name = name;
	}
	public char[] getWordFromUser(String word) {
		this.word = word;
		char[] str = new char[2];
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		str[0] = lastChar;
		str[1] = firstChar;
		return str;

	}
	public boolean checkSuccess(char word,char word1) {
		boolean play = true;
			if(word != word1 ) {
				play = false;
				return play;
				}
		return play;	
	}
}


public class WordgameApp {

	public void run() {
		Player b = new Player();
		Scanner scanner = new Scanner(System.in);
		
		String word = "�ƹ���"; 
		char abc[] = b.getWordFromUser(word); 
		char last = abc[0];
		char first = abc[1];
		
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>> ");
		int num = scanner.nextInt();
		Player pl[] = new Player[num];
		
		for(int i=0; i<pl.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = scanner.next();
			pl[i] = new Player(name);
			}

		System.out.println("�����ϴ� �ܾ�� �ƹ��� �Դϴ�.");
		int i=0;
		while(true){
				if(i == pl.length) {
					i=0;
				}
				System.out.print(pl[i].name+">>");
				word = scanner.next();
				abc = b.getWordFromUser(word);
				first = abc[1];
				if(b.checkSuccess(last,first) == false) {
					System.out.println(pl[i].name+"�� �����ϴ�.");
					break;
				}
				last = abc[0];
				 i++;
		}
	}	

	public static void main(String[] args) {
		System.out.println("�����ձ� ������ �����մϴ�...");
		WordgameApp a = new WordgameApp();
		a.run();

		
	}
}
