public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all numbers
        }
        return result; // The single number
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int[] nums1 = {2, 2, 1};
        System.out.println(sol.singleNumber(nums1)); // Output: 1

        // Test case 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(sol.singleNumber(nums2)); // Output: 4

        // Test case 3
        int[] nums3 = {1};
        System.out.println(sol.singleNumber(nums3)); // Output: 1
    }
}
