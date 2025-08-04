package Lesson9;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));  // Output: [1, 2, 3, 4, 5]

        int[] nums = {5, 3, 1, 4, 2};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 2, 3, 4, 5]

        int index = Arrays.binarySearch(nums, 3);
        System.out.println("Index of 3: " + index);  // Output: 2

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));  // true

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(copy));  // [1, 2, 3, 0, 0]

        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println(Arrays.toString(filled));  // [7, 7, 7, 7, 7]

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix));  // [[1, 2], [3, 4]]
    }
}
