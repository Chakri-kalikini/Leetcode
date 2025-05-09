import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Count occurrences of each number in nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find intersection with nums2
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                intersection.add(num);
                countMap.put(num, countMap.get(num) - 1); // Decrease count
            }
        }

        // Convert List to int array
        return intersection.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result1)); // Output: [2, 2]

        // Test case 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = solution.intersect(nums3, nums4);
        System.out.println(Arrays.toString(result2)); // Output: [4, 9] or [9, 4]
    }
}
