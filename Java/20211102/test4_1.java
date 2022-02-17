package simple;

class TV{
	String str;
	int x;
	int y;
		TV(String str,int x, int y){
			this.str = str; this.x = x; this.y = y;
		}
		void show(){
			System.out.println(str + "에서 만든 " + x +"년" + y+"인치");
		}
}

public class test4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG",2017,32);
		myTV.show();

	}

}
