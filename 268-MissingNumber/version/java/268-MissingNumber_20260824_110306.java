// Last updated: 8/24/2026, 11:03:06 AM
1import java.util.Arrays;
2
3class Solution {
4    public int missingNumber(int[] nums) {
5        Arrays.sort(nums);
6        int n=nums.length;
7        if (nums[0] != 0) 
8            return 0;
9        if (nums[n - 1] != n) 
10            return n;
11        for (int i = 1; i < nums.length; i++) {
12            if (nums[i] != i) return i;
13        }
14        return 0;
15    }
16}
17
18