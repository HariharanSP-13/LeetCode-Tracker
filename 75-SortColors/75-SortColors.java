// Last updated: 7/9/2026, 9:11:14 AM
class Solution {
    public void sortColors(int[] nums) {
        //test
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        
        
    }
}