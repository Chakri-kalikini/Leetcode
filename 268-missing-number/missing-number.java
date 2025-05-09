public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; // n is the length of the array
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0; // Sum of elements in the array

        for (int num : nums) {
            actualSum += num; // Calculate the sum of the array elements
        }

        return expectedSum - actualSum; // The missing number
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {3, 0, 1};
        System.out.println(solution.missingNumber(nums1)); // Output: 2

        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println(solution.missingNumber(nums2)); // Output: 2

        // Test case 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(solution.missingNumber(nums3)); // Output: 8
    }
}
