public class TwoDimArray
{
    public static void main(String[] args)
    {

    }

    static void example1()
    {
        // 1) Declare a 3×4 int array (all elements default to 0)
        int[][] matrix = new int[3][4];

        // 2) Assign a few values
        matrix[0][0] = 10;
        matrix[1][2] = 20;
        matrix[2][3] = 30;

        // 3) Iterate and print
        System.out.println("Matrix contents:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    static void example2()
    {
        // Declare and initialize in one go
        String[][] calendar = {
                {"Mon", "Tue", "Wed", "Thu", "Fri"},
                {"Sat", "Sun", "",    "",    ""   }
        };

        // Print like a mini‐calendar
        for (int week = 0; week < calendar.length; week++) {
            for (int day = 0; day < calendar[week].length; day++) {
                System.out.print(calendar[week][day] + "\t");
            }
            System.out.println();
        }
    }

}
