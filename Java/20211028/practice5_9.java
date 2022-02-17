
public class practice5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}		
				};
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<star.length;i++) {
			for(int j=0; j<star[i].length;j++) {
				int x = j;
				int y = (star.length-1)-i;
				// y = -3;와 동일하지만
				// 배열 크기가 달라져야하기 때문에
				// 3대신 star.length -1 대체
				
				//(i,j) =>(x,y)로 이동
				result[x][y] = star[i][j];


			}
		}
		for(int i=0; i<result.length;i++) {
			for(int j=0; j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
