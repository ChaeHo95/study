import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// 문자열만 삽입 가능한 ArrayList 생성
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요>> ");
			String s = scanner.next(); 
			a.add(s); // ArrayList 컬렉션에 삽입
		}
		
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i)); // ArrayList의 i 번째 문자열 얻어서 출력
		}
		
		// 가장 긴 이름 출력
		int longesIndex = 0; // 현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
		for(int i=0; i<a.size();i++) {
			if(a.get(longesIndex).length() < a.get(i).length()); // 이름 길이 비교
			longesIndex = i; // i번째 이름이 더 긴 이름임
		}
		System.out.println("\n가장 긴 이름은 : " + a.get(longesIndex));
		scanner.close();
	}

}
