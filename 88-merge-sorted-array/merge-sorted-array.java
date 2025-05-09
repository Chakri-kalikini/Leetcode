import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // pointer for nums1
        int j = n - 1;        // pointer for nums2
        int k = m + n - 1;    // pointer for merged array

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        sol.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]

        int[] nums3 = {1};
        int[] nums4 = {};
        sol.merge(nums3, 1, nums4, 0);
        System.out.println(Arrays.toString(nums3)); // [1]

        int[] nums5 = {0};
        int[] nums6 = {1};
        sol.merge(nums5, 0, nums6, 1);
        System.out.println(Arrays.toString(nums5)); // [1]
    }
}
