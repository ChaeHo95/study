package simple;
class ArrayUtil{
	public static int[] concat(int[] a, int[] b) {
		// �迭�� a�� b�� ������ ���ο� �迭 ����
		 int cLength = a.length + b.length;
		 int[] c = new int[cLength];
		 int count = 0;
		 for(int i=0; i<b.length; i++) {
			 if(count < a.length){
				 for(int j=0;j<a.length; j++) {
					 c[count] = a[j];
					 count++;
				 }
			 }
			 c[count] = b[i];
			 count++;
		 }
		 return c;
		
	}
	public static void print(int[] a) {
	// �迭 a ���
		System.out.print("[ ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}
}
public class test4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 5, 7, 9};
		int[] array2 = {3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
		
	}

}
