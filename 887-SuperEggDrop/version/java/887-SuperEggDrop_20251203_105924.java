// Last updated: 12/3/2025, 10:59:24 AM
1class Solution {
2    public int climbStairs(int n) {
3        if (n == 0 || n == 1) {
4            return 1;
5        }
6
7        int[] dp = new int[n+1];
8        dp[0] = dp[1] = 1;
9        
10        for (int i = 2; i <= n; i++) {
11            dp[i] = dp[i-1] + dp[i-2];
12        }
13        return dp[n];
14    }
15}