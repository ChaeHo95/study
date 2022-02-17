abstract class pairMap{
	// key ���� �����ϴ� �迭
	protected String keyArray[];
	// value���� �����ϴ� �迭
	protected String valueArray[];
	// key ���� ���� value ����. ������ null ����
	abstract String get(String key);
	// key �� value�� ������ ����. ������ key�� ������, ���� value�� ����
	abstract void put(String key, String value);
	// key ���� ���� ������(value�� �Բ�) ����
	abstract String delete(String key);
	// ���� ����� �������� ���� ����
	abstract int lenght();
	
	
}
class Dictionary extends pairMap{
	int num = 0; // �������� �迭��ȣ
	public Dictionary(int i) {
		keyArray = new String[i];
		valueArray = new String[i];
	}

	
	@Override
	String get(String key) {
		// key ���� ���� value ����. ������ null ����
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) {
		// key �� value�� ������ ����. ������ key�� ������, ���� value�� ����
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
		// key ���� ���� ������(value�� �Բ�) ����
		for(int i=0; i<keyArray.length; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = null;
			}
		}
		return null;
	}

	@Override
	int lenght() {
		// ���� ����� �������� ���� ����
	 return num++;
	}
}
public class test5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����"); // Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); // ������ ������ ����
		
		

	}

}
