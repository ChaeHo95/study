package simple;

class Song{
	String title;
	String artist;
	int year;
	String country;
	Song(){}
	Song(String t, String a, int y, String c){
		this.title = t; this.artist = a; this.year = y; this.country = c;
		
	}
	void show() {
		System.out.println(year + "년"+ country +"국적의 " + artist + "가 부른" + title);
	}
}
public class test4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "Dancing Queen";
		String a = "ABBA";
		String c = "스웨덴";
		int y = 1978;
		Song s = new Song(t,a,y,c);
		
		s.show();
		
		
	}

}
