public class Solution {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = product + result[pos2];
                result[pos2] = sum % 10;
                result[pos1] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    // Optional main method for testing (not needed if your platform provides its own test runner)
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.multiply("2", "3"));       // Output: 6
        System.out.println(sol.multiply("123", "456"));   // Output: 56088
    }
}
