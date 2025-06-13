public class RelationalOperator
{
    public static void main(String[] args)
    {
        ValueObject v1 = new ValueObject();
        ValueObject v2 = new ValueObject();
        v1.value = 47;
        v2.value = 47;
        System.out.println(v1==v2);     //  reference are different although...
    }
}

class ValueObject
{
    int value;
}
