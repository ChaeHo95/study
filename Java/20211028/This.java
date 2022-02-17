
public class This {
	String title;
	String author;
	void show() {System.out.println(title + " " + author);}
	
	public This() {
		this("","");
		System.out.println("생성자 호출됨");
	} 
	public This(String title) {
		this(title,"작자미상");
	}
	public This(String title, String author) {
		this.title = title; 
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This littlePrince = new This("어린 왕자", "생텍쥐페리");
		This loveStory = new This("춘향전");
		This emptyBook = new This();
		loveStory.show();
		

	}

}
