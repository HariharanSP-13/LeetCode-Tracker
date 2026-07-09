// Last updated: 7/9/2026, 9:10:57 AM
class Solution {
    public int maxProduct(int[] nums) {
        int prod;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            prod=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                max=Math.max(prod,max);
                
            }
        }
        return max;
    }
}