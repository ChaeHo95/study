class Student{
	String name; int ban; int no; int kor;
	int eng; int math;
	int getTotal(){
		int total = kor+eng+math;
		return total;
	}
	float getAverage() {
		String Average = String.format("%.1f",(this.getTotal()/3.0)); 
		return Float.parseFloat(Average);
	}
}
public class practice6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�: " + s.name);
		System.out.println("����: " + s.getTotal());
		System.out.println("��: " + s.getAverage());

	}

}
