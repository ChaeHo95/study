abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    Point getPosition() {
        return p;
    }

    void setPosition() {
        this.p = p;
    }

    abstract double calcArea();

}

class Point {
    int x, y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + "," + y + "}";
    }
}

class Circle extends Shape {
    double r;
    public Circle(double d) {
        this.r =d;
    }
    double calcArea(){
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape {
    double width, height;
    public Rectangle(int i, int j) {
        this.width=i;
        this.height=j;
    }

    double calcArea(){
        return width*height;
    }

    boolean isSquare() {
        if(width == height){
            return true;
        }
        return false;
    }
}


public class Exercise7_22 {
    static double sumArea(Shape[] arr){
       double result = 0;
        for(int i=0; i<arr.length; i++){
            result += arr[i].calcArea();
        }
        return result;
    }
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        System.out.println("sum of areas : "+ sumArea(arr));

    }

}
