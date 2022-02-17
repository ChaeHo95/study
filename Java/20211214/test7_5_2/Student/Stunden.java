package test7_5_2.Student;

public class Stunden {
    private String name;
    private String clas;
    private int nummer;
    private Double note;

    public Stunden(String name, String clas, int nummer, Double note){
        this.name = name; this.clas = clas; this.nummer = nummer; this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getClas() {
        return clas;
    }

    public Double getNote() {
        return note;
    }

    public int getNummer() {
        return nummer;
    }
    public String toString(){
        String toString = "이름: " + getName() + "\n" + "학과: " + getClas() + "\n" + "학번: "
                + getNummer() +"\n" + "학점 평균: " + getNote() + "\n";
        return toString;
    }
    public String totoString(){
        return "이름: " + getName() + ", " + "학과: " + getClas() + ", " + "학번: "
                + getNummer() +", " + "학점 평균: " + getNote();
    }
}
