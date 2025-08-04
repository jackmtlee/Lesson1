package midterm;

// Level 1
interface Shape
{
    void displayInfo();
}
// Level 2
interface TwoDimensional extends Shape
{
    double getArea();
}
interface ThreeDimensional extends Shape
{
    double getVolume();
}
// Level 3
class Rectangle implements TwoDimensional
{
    private double length;
    private double width;
    public void displayInfo() {
        System.out.println("drawing a triangle");
    }

    public double getArea(){return length * width;}
}
class Square implements TwoDimensional
{
    private double length;
    public void displayInfo() {
        System.out.println("drawing a square");
    }

    public double getArea(){return length * length;}
}
class Circle implements TwoDimensional
{
    private double radius;
    final private double  PI = 3.14;

    public void displayInfo() {
        System.out.println("drawing a circle");
    }

    public double getArea(){return PI * radius * radius;}
}

class Cube implements ThreeDimensional
{
    private double length;
    public void displayInfo() {
        System.out.println("drawing a Cube");
    }
    public double getVolume()
    {return length * length * length;}
}

class Cylinder implements ThreeDimensional
{
    private double length;
    private double radius;
    final private double  PI = 3.14;

    public void displayInfo() {
        System.out.println("drawing a Cylinder");
    }
    public double getVolume()
    {return PI * radius * radius * length;}
}

public class ShapeMain
{

}
