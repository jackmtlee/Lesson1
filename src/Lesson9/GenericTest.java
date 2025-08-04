package Lesson9;


import java.util.Collection;
import java.util.HashMap;

class ArrayAlg
{
    public static <T> T getMiddle(T... a)
    {
        return a[a.length / 2];
    }
}

public class GenericTest {
    public static void main(String[] args) {
        String middle = ArrayAlg.<String>getMiddle("John", "Q.",
                "Public");
    }


//    Collection
}



class Pair<T>
{
    private T first;
    private T second;
    public Pair() { first = null; second = null; }
    public Pair(T first, T second) { this.first = first;
        this.second = second; }
    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }
}


//public class GenericTest {
//    public static void main(String[] args) {
//        Pair<String> pair = new Pair<>("Hello", "World");
//        //         cannot use int
//        AnotherPair<Integer, String> anotherPair = new AnotherPair<>(1,"Hello");
//    }
//}


class AnotherPair<T1, T2>
{
    private T1 first;
    private T2 second;
    public AnotherPair() { first = null; second = null; }
    public AnotherPair(T1 first, T2 second) { this.first = first;
        this.second = second; }
    public T1 getFirst() { return first; }
    public T2 getSecond() { return second; }
    public void setFirst(T1 newValue) { first = newValue; }
    public void setSecond(T2 newValue) { second = newValue; }
}