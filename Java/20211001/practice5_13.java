package simple;

import java.util.Scanner;
import java.util.Random;
public class practice5_13 {

	public static void main(String args[]) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
			
			for(int j=0; j < question.length; j++) {
				int idx = random.nextInt(question.length);
				char tmp;
				
				tmp = question[j];
				question[j] = question[idx];
				question[idx] = tmp;
				
			}
			System.out.printf("Q%d. %s�� ������ �Է��ϼ��� .>", i + 1, new String(
					question));
			String answer = scanner.nextLine();

			// trim()���� answer�� �¿� ������ ������ �� , equals�� word[i]�� ��
			if (words[i].equals(answer.trim()))
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			else
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
	} // main�� ��
}
