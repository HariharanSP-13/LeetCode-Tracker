// Last updated: 7/9/2026, 9:10:26 AM
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
}