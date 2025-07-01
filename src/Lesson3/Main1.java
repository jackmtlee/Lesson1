package Lesson3;


class Mammal
{
    public void makeSound(){}
}
//class Dog extends Mammal
//{
//    public void makeSound(){System.out.println("bark");}
//}
class Cat extends Mammal
{
    public void makeSound(){System.out.println("mewo");}
}
class Mouse extends Mammal
{
    public void makeSound(){System.out.println("squeak");}
}
public class Main1
{
    public static void makeSound(Mammal mammal)
    {
        mammal.makeSound();
    }
    public static void main(String[] args)
    {
//        makeSound(new Dog());
        makeSound(new Cat());
        makeSound(new Mouse());
    }
}
