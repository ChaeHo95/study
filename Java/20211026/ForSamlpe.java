
public class ForSamlpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// ���� i�� for���� ����� ����Ҽ� ����
		for(int i=1; i<=10; i++) {// 1~10���� �ݺ�
			sum += i;
			System.out.println(i); // ���ϴ� �� ���
			
			if(i<=9)// 1~9������ '+'���
				System.out.println("+");
			else {  // i�� 10�ΰ��
				System.out.println("="); // '='����ϰ�
				System.out.println(sum); // ���� ��� ���
			}
		}

	}

}
