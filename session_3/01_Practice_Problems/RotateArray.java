import java.util.Arrays;

public class RotateArray {

    // Rotate array to the right by k positions
    public static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }

        k = k % n; // Reduce k if it is larger than array length
        int[] result = new int[n];

        // Calculate target index for each element
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        System.out.println("Original: " + Arrays.toString(arr1) + ", k = " + k1);
        System.out.println("Rotated : " + Arrays.toString(rotateArray(arr1, k1)));

        int[] arr2 = {1, 2};
        int k2 = 3;
        System.out.println("\nOriginal: " + Arrays.toString(arr2) + ", k = " + k2);
        System.out.println("Rotated : " + Arrays.toString(rotateArray(arr2, k2)));
    }
}
