public class DataType
{
    public static void main(String[] args)
    {
        byte b = 100;
        short s = 30000;
        int i = 1_000_000;
        long L = 5_000_000_000L;
        float f = 3.14f;
        double d = 2.71828;
        char c = 'A';
        boolean flag = true;

        System.out.printf("b=%d, s=%d, i=%d, L=%d, f=%.2f, d=%.5f, c=%c, flag=%b%n",
                b, s, i, L, f, d, c, flag);
    }





//    void fn()
//    {
//        // Example 1
//        // Invalid:
//        // List<int> listOfInts;       // ❌ primitive not allowed
//
//        // Correct:
//        List<Integer> listOfInts;     // ✅ uses wrapper
//        Map<Character, Boolean> flags; // ✅ uses wrappers
//
//        // Example 2
//        List<Integer> scores = new ArrayList<>();
//        scores.add(42);        // autoboxes int → Integer
//        Integer x = scores.get(0);
//
//
//    }


}
