
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		
		for(int i=0;i<args.length;i++) // ���� ������ŭ �ݺ�
			sum += Double.parseDouble(args[i]); 
			//���ڿ��� �Ǽ�(doubleŸ��)�� ��ȯ�Ͽ� �ջ�

		System.out.println("�հ� :" + sum);
	}

}
