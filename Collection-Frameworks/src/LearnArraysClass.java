import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int nums[] = { 1, 5, 2, 3, 7, 4, 9, 6, 8 };

        // Search an element
        System.out.println(Arrays.binarySearch(nums, 7));

        System.out.println(Arrays.toString(nums)); // Printing an array
        Arrays.sort(nums); // Sorting an array
        // if elements in array are greater than 8192(2^13) then we can use parellelSort(divides work between multiple processors)
        // Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.fill(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}