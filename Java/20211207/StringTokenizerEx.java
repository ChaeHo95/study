import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) {
		// �����ڷ� '/' ���
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
		
		while(st.hasMoreTokens()) { // ��ū�� �ִ� ����
			System.out.println(st.nextToken());
			
		}
	}
}
