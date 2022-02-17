class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String departnemt;
	public Student(String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p;
		Student s = new Student("이재문");
		p = s; // 업캐스팅
		
		System.out.println(p.name); // 오류 없음
		
		
		// p.grade = "A"; // 컴파일 오류
		// p.department = "Con" // 컴파일 오류

	}

}
