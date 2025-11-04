import java.util.*;

class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] dp = new int[n];      // dp[i] = length of LIS ending at i
        int[] count = new int[n];   // count[i] = number of LIS ending at i

        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);

        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j]; // new longer sequence
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j]; // another sequence of same length
                    }
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        // Count total LIS of maximum length
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxLen) total += count[i];
        }

        return total;
    }
}
