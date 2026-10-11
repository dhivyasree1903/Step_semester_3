import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    // Prefix sum combined with HashMap frequency counting in O(n)
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        // Stores frequency of each prefix sum
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1); // Base case: prefix sum of 0 appears once

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) was seen before, those prefix points form subarrays summing to k
            if (prefixCounts.containsKey(currentSum - k)) {
                count += prefixCounts.get(currentSum - k);
            }

            prefixCounts.put(currentSum, prefixCounts.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println("Array: " + Arrays.toString(nums1) + ", k = " + k1);
        System.out.println("Subarrays count: " + subarraySum(nums1, k1)); // 2

        int[] nums2 = {1, -1, 0};
        int k2 = 0;
        System.out.println("\nArray: " + Arrays.toString(nums2) + ", k = " + k2);
        System.out.println("Subarrays count: " + subarraySum(nums2, k2)); // 3
    }
}
