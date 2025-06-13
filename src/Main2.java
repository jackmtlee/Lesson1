class Test2 {
    public Test2() {
        System.out.println("test constructor");
    }
}
class Base2 {
    static Test2 t1 = new Test2();
    public Base2() {
        System.out.println("base constructor");
    }
    static int staticValue = getValue("get static value in Base");
    int nonstaticValue = getValue("get non static value in Base");

    static int getValue(String str) {
        System.out.println(str);
        return 47;
    }
}
public class Main2 extends Base2 {
    static Test2 t2 = new Test2();
    static int staticValue = getValue("get static value in Main");
    int nonstaticValue = getValue("get non static value in Main");

    public Main2() {
        System.out.println("main constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main method");
        new Main2();
    }
}
