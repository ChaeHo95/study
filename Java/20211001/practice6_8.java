public class practice6_8 {

int kind; // 인스턴스 변수

int num; 



static int width; // 클래스 변수

static int height; 

//변수가 선언된 위치를 보면 변수의 종류를 알 수 있다. 
//클래스 블럭 내에 선언된 변수는 인스턴스 변수이고, 
//static이 붙은 것은 static변수(클래스 변수)이다. 
//그리고 나머지는 모두 지역변수이다

practice6_8(int k, int n) { 

kind = k; // 지역변수

num = n; 

} 

	public static void main(String[] args){
		practice6_8 card = new practice6_8(1,1);
	}
}
