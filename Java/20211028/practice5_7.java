
public class practice5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE: java Exercies5_7 3120");
			System.exit(0);
		}
		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10} ; //������ ����
		int[] coin = {5, 5, 5, 5}; // ������ ���� ����
		
		for(int i=0; i<coinUnit.length;i++) {
			int coinNum = 0;
			coinNum = money/coinUnit[i];
			if(coinNum > coin[i]) {
				coin[i] -= 5;
				money = money - (coinUnit[i]*5);
				System.out.println(coinUnit[i] + "�� : " +  5  + "�� ");
			} 
			else {
			coin[i] = coin[i] - coinNum;
			money = money - (coinUnit[i]*coinNum);
			System.out.println(coinUnit[i] + "�� : " + coinNum  + "�� ");
			}
			
			
}	
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
			System.out.println("=���� ������ ����=");
			
			for(int i=0; i<coinUnit.length;i++) {
				System.out.println(coinUnit[i] + "��" + coin[i]+"��");
			}
			
		}

	}

