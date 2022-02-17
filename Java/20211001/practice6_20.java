import java.util.Random;
public class practice6_20 {
	public static int[] shuffle(int[] arr) {
		Random random =  new Random();
		for (int i=0; i<arr.length;i++) {
			int ran = random.nextInt(arr.length);
			int idx = arr[i];
			arr[i] = arr[ran];
			arr[ran] = idx;
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(java.util.Arrays.toString(original));



		int[] result = shuffle(original);

		System.out.println(java.util.Arrays.toString(result));

	}

}
