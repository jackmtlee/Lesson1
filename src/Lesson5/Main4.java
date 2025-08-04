package Lesson5;

class Shape {
    void draw() {
        System.out.println("draw a Shape");
    }

    public Shape() {
        System.out.println("shape before draw");
        draw();
        System.out.println("shape after draw");
    }
}

class Circle extends Shape {
    int radius = 1;

    public Circle(int radius) {
        this.radius = radius;
        System.out.println("circle constructor , radius = " + radius);
    }

    void draw() {
        System.out.println("draw a circle, radius = " + radius);
    }
}

public class Main4 {
    public static void main(String[] args) {
        new Circle(5);
    }
}


