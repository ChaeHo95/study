
public class This {
	String title;
	String author;
	void show() {System.out.println(title + " " + author);}
	
	public This() {
		this("","");
		System.out.println("������ ȣ���");
	} 
	public This(String title) {
		this(title,"���ڹ̻�");
	}
	public This(String title, String author) {
		this.title = title; 
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This littlePrince = new This("� ����", "�������丮");
		This loveStory = new This("������");
		This emptyBook = new This();
		loveStory.show();
		

	}

}
