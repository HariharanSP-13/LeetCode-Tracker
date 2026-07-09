// Last updated: 7/9/2026, 9:11:33 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        //test
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}