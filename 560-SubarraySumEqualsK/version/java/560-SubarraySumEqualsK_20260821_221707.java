// Last updated: 8/21/2026, 10:17:07 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int[] sum = new int[n];
5        sum[0] = nums[0];
6        for (int i = 1; i < n; i++) {
7            sum[i] = sum[i - 1] + nums[i];
8        }
9        int count = 0;
10        for (int i = 0; i < n; i++) {
11            if (sum[i] == k) count++;
12            for (int j = 0; j < i; j++) {
13                if (sum[i] - sum[j] == k) {
14                    count++;
15                }
16            }
17        }
18        return count;
19    }
20}