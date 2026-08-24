// Last updated: 8/24/2026, 10:25:14 AM
1class Solution {
2    public int rob(int[] nums) {
3        if(nums.length==0)
4            return 0;
5        else if(nums.length == 1)
6            return nums[0];
7        else if(nums.length == 2)
8            return Math.max(nums[0],nums[1]);
9        int[] nums1 = nums.clone();
10        int max1 = 0;
11        nums1[1] = Math.max(nums1[0],nums1[1]);
12        for(int i = 2; i<nums1.length-1;i++){
13            nums1[i] = Math.max(nums1[i]+nums1[i-2],nums1[i-1]);
14        }
15        max1 = nums1[nums1.length-2];
16        int max2 = 0;
17        nums[2] = Math.max(nums[1],nums[2]);
18        for(int i = 3; i<nums.length;i++){
19            nums[i] = Math.max(nums[i]+nums[i-2],nums[i-1]);
20        }
21        max2 = nums[nums.length-1];
22        return Math.max(max1,max2);
23    }
24}