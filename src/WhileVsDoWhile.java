public class WhileVsDoWhile {
    public static void main(String[] args) {
        boolean flag = false;

        // Example 1: while-loop
        System.out.println("Entering while-loop:");
        int count1 = 0;
        while (flag) {
            // This block will NEVER execute, because flag is false initially.
            count1++;
            System.out.println("  while body, count1 = " + count1);
        }
        System.out.println("Exited while-loop with count1 = " + count1);


        // Example 2: do…while-loop
        System.out.println("\nEntering do…while-loop:");
        int count2 = 0;
        do {
            // This block executes ONCE before the condition is checked.
            count2++;
            System.out.println("  do…while body, count2 = " + count2);
        } while (flag);  // flag is still false, so loop stops here
        System.out.println("Exited do…while-loop with count2 = " + count2);
    }
}
