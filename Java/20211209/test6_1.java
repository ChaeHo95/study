class MyPoint{
    private int x;
    private int y;

    public MyPoint (int x, int y){
        this.x = x; this.y = y;
    }

    public boolean equals(Object obj){
        MyPoint p = (MyPoint) obj; // 객체 obj를 MyPoint 타입으로 다운 캐스팅
        if(x == p.x && y == p.y){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString(){
        return ("Point ("+x+","+y+")");
    }
}

public class test6_1 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3,50);
        MyPoint q = new MyPoint(4,50);
        System.out.println(p);

        if(p.equals(q)){
            System.out.println("같은 점");
        }
        else {
            System.out.println("다른 점");
        }
    }
}
