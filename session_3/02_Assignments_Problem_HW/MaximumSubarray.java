import java.util.Arrays;

public class MaximumSubarray {

    // Kadane's Algorithm to find maximum subarray sum in O(n)
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend current subarray or restart from nums[i]
            if (currentSum + nums[i] > nums[i]) {
                currentSum = currentSum + nums[i];
            } else {
                currentSum = nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] test1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Array: " + Arrays.toString(test1));
        System.out.println("Max Subarray Sum: " + maxSubArray(test1)); // 6

        int[] test2 = {-3, -1, -2};
        System.out.println("\nArray: " + Arrays.toString(test2));
        System.out.println("Max Subarray Sum: " + maxSubArray(test2)); // -1
    }
}
