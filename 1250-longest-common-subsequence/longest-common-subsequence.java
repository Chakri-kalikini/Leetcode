public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        // Create a 2D array to store lengths of LCS
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp table
        for (int i = 1; i <= m; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= n; j++) {
                char c2 = text2.charAt(j - 1);
                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // match
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // skip one character
                }
            }
        }

        // The bottom-right cell contains the length of LCS
        return dp[m][n];
    }

    // Optional main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestCommonSubsequence("abcde", "ace")); // Output: 3
        System.out.println(sol.longestCommonSubsequence("abc", "abc"));   // Output: 3
        System.out.println(sol.longestCommonSubsequence("abc", "def"));   // Output: 0
    }
}
