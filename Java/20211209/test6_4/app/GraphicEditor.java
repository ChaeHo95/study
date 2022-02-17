package test6_4.app;

import test6_4.base.Shape;
import test6_4.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
