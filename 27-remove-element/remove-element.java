import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place it at the k-th position
                nums[k] = nums[i];
                // Move the k pointer forward
                k++;
            }
        }

        // Return the count of elements not equal to val
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println(k1); // Output: 2
        System.out.println(Arrays.toString(Arrays.copyOf(nums1, k1))); // Output: [2, 2]

        // Test case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println(k2); // Output: 5
        System.out.println(Arrays.toString(Arrays.copyOf(nums2, k2))); // Output: [0, 1, 3, 0, 4]
    }
}
