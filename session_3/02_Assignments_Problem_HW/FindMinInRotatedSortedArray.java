import java.util.Arrays;

public class FindMinInRotatedSortedArray {

    // Modified binary search to find minimum element in O(log n) time
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost element, minimum must be in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Minimum is at mid or in left half
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] test1 = {3, 4, 5, 1, 2};
        System.out.println("Array: " + Arrays.toString(test1));
        System.out.println("Minimum: " + findMin(test1)); // 1

        int[] test2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("\nArray: " + Arrays.toString(test2));
        System.out.println("Minimum: " + findMin(test2)); // 0

        int[] test3 = {11, 13, 15, 17};
        System.out.println("\nArray: " + Arrays.toString(test3));
        System.out.println("Minimum: " + findMin(test3)); // 11
    }
}
