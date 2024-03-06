public class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i] = nums[i];
                } else {
                    dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
                }
            }
        }

        return dp[n - 1] >= 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the Solution class
        int[] nums1 = {1, 5, 2};
        System.out.println("Output 1: " + solution.predictTheWinner(nums1)); // Output: false

        int[] nums2 = {1, 5, 233, 7};
        System.out.println("Output 2: " + solution.predictTheWinner(nums2)); // Output: true
        System.out.println("21BCS3246_Sahana");
    }
}
