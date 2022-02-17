package test6_3.App;

import test6_3.Calc.Calc;

public class MainApp {
    public static void main(String[] args) {
        Calc c = new Calc(10,20);
        System.out.println(c.sum());
    }
}
