import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// ���ڿ��� ���� ������ ArrayList ����
		ArrayList<String> a = new ArrayList<String>();
		
		// Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("�̸��� �Է��ϼ���>> ");
			String s = scanner.next(); 
			a.add(s); // ArrayList �÷��ǿ� ����
		}
		
		// ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i)); // ArrayList�� i ��° ���ڿ� �� ���
		}
		
		// ���� �� �̸� ���
		int longesIndex = 0; // ���� ���� �� �̸��� �ִ� ArrayList ���� �ε���
		for(int i=0; i<a.size();i++) {
			if(a.get(longesIndex).length() < a.get(i).length()); // �̸� ���� ��
			longesIndex = i; // i��° �̸��� �� �� �̸���
		}
		System.out.println("\n���� �� �̸��� : " + a.get(longesIndex));
		scanner.close();
	}

}
