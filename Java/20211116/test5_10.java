abstract class pairMap{
	// key 들을 저장하는 배열
	protected String keyArray[];
	// value들을 저장하는 배열
	protected String valueArray[];
	// key 값을 가진 value 리턴. 없으면 null 리턴
	abstract String get(String key);
	// key 와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	abstract void put(String key, String value);
	// key 값을 가진 아이템(value와 함께) 삭제
	abstract String delete(String key);
	// 현재 저장된 아이템의 개수 리턴
	abstract int lenght();
	
	
}
class Dictionary extends pairMap{
	int num = 0; // 아이템의 배열번호
	public Dictionary(int i) {
		keyArray = new String[i];
		valueArray = new String[i];
	}

	
	@Override
	String get(String key) {
		// key 값을 가진 value 리턴. 없으면 null 리턴
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// key 와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
		int i = 0;
		while( i < keyArray.length) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
			}
			 i++;
			}
		if(i == keyArray.length) {
		keyArray[num] = key;	valueArray[num] = value;
		num++;
		} 
	}

	@Override
	String delete(String key) {
		// key 값을 가진 아이템(value와 함께) 삭제
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = null;
			}
		}
		return null;
	}

	@Override
	int lenght() {
		// 현재 저장된 아이템의 개수 리턴
	 return num++;
	}
}
public class test5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태"); // 황기태 아이템 삭제
		System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근
		
		

	}

}
