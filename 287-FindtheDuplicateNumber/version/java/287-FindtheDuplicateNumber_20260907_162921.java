// Last updated: 9/7/2026, 4:29:21 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet();
4        for(int i=0;i<nums.length;i++) {
5            if(set.contains(nums[i])) return nums[i];
6            set.add(nums[i]);
7        }
8        return -1;
9    }
10}