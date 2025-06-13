class Mammal
{
    public void makeSound() {}
}
class Dog extends Mammal
{
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
class Cat extends Mammal
{
    @Override
    public void makeSound() {
        System.out.println("mewo");
    }
}
class Mouse extends Mammal
{
    @Override
    public void makeSound() {
        System.out.println("chi");
    }
}
public class Main4
{
    public static void makeSound(Mammal mammal)
    {
        mammal.makeSound();
    }

    public static void main(String[] args)
    {
        makeSound(new Dog());
        makeSound(new Cat());
        makeSound(new Mouse());
    }
}
