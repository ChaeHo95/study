package simple;

public class practice6_24 {
	static int ads(int value) {
		if(value < 0) {
			value = -value;
			return value;
		}
		else {
			return value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value + "�� ���밪 : " + ads(value));
		value = -10;
		System.out.println(value + "�� ���밪 : " + ads(value));

	}

}
