class Circle{
    private int x,y;
    private int radius;

    public Circle (int x, int y, int radius){
        this.x = x; this.y = y; this.radius = radius;
    }

    public boolean equals(Object obj){
        Circle p = (Circle) obj; // 객체 obj를 Circle 타입으로 다운 캐스팅
        System.out.println(obj);
        if(x == p.x && y == p.y){
            return true;
        }
        else {
            return false;
        }
    }
    public String toString(){
        return ("Circle ("+x+","+y+") 반지름"+radius);
    }

}
public class test6_2 {
    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("원 a :" + a);
        System.out.println("원 b :" + b);
        if(a.equals(b)){
            System.out.println("같은 원");
        }
        else{
            System.out.println("서로 다른 원");
        }
    }
}
