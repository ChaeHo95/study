package simple;

public class practice6_23 {

	static int max(int[] arr) {
		if(arr == null || arr.length == 0 ) {
			return -9999999;
		}
		else {
			int max = 0;
			for(int i=0; i< arr.length; i++) {
				if(arr[i] > max) {
					max=arr[i];
				}
			} return max;
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] date = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(date));
		System.out.println("최대값 : "+ max(date));
		System.out.println("최대값 : "+ max(null));
		System.out.println("최대값 : "+ max(new int[] {}));

	}

}
