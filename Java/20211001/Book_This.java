
public class Book_This {
	String title;
	String author;
	void show() {System.out.println(title + "" + author);}
	
	public Book_This(){
		this("","");
		System.out.println("������ ȣ���");
	}
	
	public Book_This(String title) {
		this(title,"���ڹ̻�");
	}
	public Book_This(String title,String author) {
		this.title = title; this.author = author;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_This littlePrince = new Book_This("�����","�������丮");
		Book_This loveStory = new Book_This("������");
		Book_This emptyBook = new Book_This();
		loveStory.show();
	}

}
