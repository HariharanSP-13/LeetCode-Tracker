// Last updated: 8/11/2026, 3:58:32 PM
1class Solution {
2    public int numSubseq(int[] nums, int target) {
3        int mod = 1000000007 , n = nums.length;
4        Arrays.sort(nums);
5        
6        int[] power = new int[n];
7        power[0] = 1;
8        for (int i = 1; i < n; i++) {
9            power[i] = (power[i - 1] * 2) % mod;
10        }
11        int left = 0 , right = n - 1 , result = 0;
12        while (left <= right) {
13            if (nums[left] + nums[right] <= target) {
14                result = (result + power[right - left]) % mod;
15                left++;
16            } else {
17                right--;
18            }
19        }
20        return result;
21    }
22}