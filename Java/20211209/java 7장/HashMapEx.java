import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<String, String>();
		// �ؽø� ����
		// var dic = new HashMap<String, String>();�� ������ �ᵵ ��
		
		// 3���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		// ����ڷκ��� ����ܾ �Է¹ް� �ѱ� �ܾ� �˻�. "exit" �Է¹����� ����
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("����");
				break;
			}
			// �ؽøʿ��� 'Ű' eng�� ��'��' kor �˻�
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			}
			else {
				System.out.println(kor);
			}
			scanner.close();
		}
	}

}
