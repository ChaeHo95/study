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
public class DowncastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student("¿Ã¿ÁπÆ");
		Student s;
		
		s = (Student)p;
		System.out.println(p.name); 
		
		
		 s.grade = "A"; 
		 s.departnemt = "Con";

	}

}
