package Lesson4;

abstract class Shape
{
    public abstract void draw();
    public abstract void erase();
    public String getName() { return getClass().getSimpleName(); }
}

abstract class TwoDimensionalShape extends Shape
{
    public abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape
{
    public abstract double getVolume();
}

class Triangle extends TwoDimensionalShape
{
    public void draw() { System.out.println("draw a triangle"); }
    public void erase() { System.out.println("erase a triangle"); }
    public double getArea() { return 0; }
}

class Cube extends ThreeDimensionalShape
{
    public void draw() { System.out.println("draw a cube"); }
    public void erase() { System.out.println("erase a cube"); }
    public double getVolume() { return 0; }
}
