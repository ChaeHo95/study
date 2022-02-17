package test7_8.Person;

public class Person {
    private int point;
    private String name;

    public Person(String name, int point){
        this.name = name; this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "("+name+", "+point+")";
    }
}
