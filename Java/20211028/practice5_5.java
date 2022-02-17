
public class practice5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length;i++) {
			int j = (int)(Math.random()*ballArr.length);
			ballArr[i] = j; 
			for(int k=0; k<i; k++) {
				if(ballArr[i] == ballArr[k]) {
					 	i--;
				}
				
			}
		}
		for(int i=0; i<3; i++) {
			ball3[i]=ballArr[i];
		}
		for(int i=0; i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}

	}
}
