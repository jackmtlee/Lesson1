interface Shape
{
    public abstract void draw();
    public abstract void erase();
}

interface TwoDimensionalShape extends Shape
{
    public abstract double getArea();
}

interface ThreeDimensionalShape extends Shape
{
    public abstract double getVolume();
}

class Triangle implements TwoDimensionalShape
{
    public void draw() { System.out.println("draw a triangle"); }
    public void erase() { System.out.println("erase a triangle"); }
    public double getArea() { return 0; }
}

class Cube implements ThreeDimensionalShape
{
    public void draw() { System.out.println("draw a cube"); }
    public void erase() { System.out.println("erase a cube"); }
    public double getVolume() { return 0; }
}
