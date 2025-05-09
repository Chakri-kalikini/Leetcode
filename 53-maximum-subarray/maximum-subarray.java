public class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize variables
        int maxSum = nums[0]; // This will hold the maximum sum found
        int currentSum = nums[0]; // This will hold the current subarray sum

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to either the current element or the current element plus the currentSum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // Return the maximum sum found
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums1)); // Output: 6

        // Test case 2
        int[] nums2 = {1};
        System.out.println(solution.maxSubArray(nums2)); // Output: 1

        // Test case 3
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(solution.maxSubArray(nums3)); // Output: 23
    }
}
