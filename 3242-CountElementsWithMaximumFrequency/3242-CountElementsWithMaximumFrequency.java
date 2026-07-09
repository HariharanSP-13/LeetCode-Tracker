// Last updated: 7/9/2026, 9:10:04 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
         Arrays.sort(nums);  
        int maxFreq = 1;
        int currentFreq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentFreq++;
            } else {
                currentFreq = 1;
            }
            maxFreq = Math.max(maxFreq, currentFreq);
        }
        int total = 0;
        currentFreq = 1;
        for (int i = 1; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1]) {
                currentFreq++;
            } else {
                if (currentFreq == maxFreq) {
                    total += currentFreq;
                }
                currentFreq = 1;
            }
        }
        return total;
    }
}