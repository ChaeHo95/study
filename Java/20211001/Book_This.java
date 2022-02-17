
public class Book_This {
	String title;
	String author;
	void show() {System.out.println(title + "" + author);}
	
	public Book_This(){
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book_This(String title) {
		this(title,"작자미상");
	}
	public Book_This(String title,String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_This littlePrince = new Book_This("어린왕자","색텍쥐페리");
		Book_This loveStory = new Book_This("춘향전");
		Book_This emptyBook = new Book_This();
		loveStory.show();
	}

}
