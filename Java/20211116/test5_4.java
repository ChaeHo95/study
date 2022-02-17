import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src); //추상 메소드
	abstract protected String getSrcString(); // 추상 메소드
	abstract protected String getDestString(); // 추상메소드	
	protected double ratio; // 비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		sc.close();
	}
}
public class test5_4 extends Converter {
	public test5_4(double ratio) {
		this.ratio = ratio;
	}
	protected double convert(double src){
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5_4 toMile = new test5_4(1.6); // 1마일은 1.6km
		toMile.run();

	}

}
