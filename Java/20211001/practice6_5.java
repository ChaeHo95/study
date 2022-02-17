class Student2{
	String name; int ban; int no; int kor;
	int eng; int math;
	public Student2(String name, int ban, int no, int kor,
	int eng, int math) {
		this.name = name;
		this.ban = ban; 
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
			
		}
	int getTotal(){
		int total = kor+eng+math;
		return total;
	}
	float getAverage() {
		String Average = String.format("%.1f",(this.getTotal()/3.0)); 
		return Float.parseFloat(Average);
	}
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," +
	eng + "," + math + ","+ getTotal() + "," + getAverage();
	}
	}
public class practice6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s =new Student2("ȫ�浿",1,1,100,60,76);
		
		System.out.println(s.info());
	}

}
