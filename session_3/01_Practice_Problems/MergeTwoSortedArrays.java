import java.util.Arrays;

public class MergeTwoSortedArrays {

    // Merge two sorted arrays using two pointers
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0; // index for arr1
        int j = 0; // index for arr2
        int k = 0; // index for result

        // Pick the smaller element from arr1 or arr2
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1 if any
        while (i < n1) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2 if any
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5};
        int[] a2 = {2, 4, 6};
        System.out.println("arr1: " + Arrays.toString(a1));
        System.out.println("arr2: " + Arrays.toString(a2));
        System.out.println("Merged: " + Arrays.toString(mergeSortedArrays(a1, a2)));

        int[] b1 = {};
        int[] b2 = {1, 2, 3};
        System.out.println("\narr1: " + Arrays.toString(b1));
        System.out.println("arr2: " + Arrays.toString(b2));
        System.out.println("Merged: " + Arrays.toString(mergeSortedArrays(b1, b2)));
    }
}
