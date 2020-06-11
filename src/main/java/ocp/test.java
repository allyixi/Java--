package ocp;

public class test {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShap(new Renctangle());
        graphicEditor.drawShap(new Circle());
    }
}

class GraphicEditor {
    public void drawShap(Shape s) {
        s.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Renctangle extends Shape {

    public void draw() {
        System.out.println("Rectangle");
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Circle");
    }
}
