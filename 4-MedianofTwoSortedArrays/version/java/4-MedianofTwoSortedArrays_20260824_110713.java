// Last updated: 8/24/2026, 11:07:13 AM
1
2class Solution {
3  
4    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
5       //test
6        int nums3[]=new int[nums1.length+nums2.length];
7         System.arraycopy(nums1, 0, nums3, 0, nums1.length);
8        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
9         Arrays.sort(nums3);
10        int len=nums3.length;
11        if(len % 2==0){
12            return (nums3[len / 2] + nums3[len / 2 - 1])/2.0; 
13        }
14        else
15            return nums3[len/2];
16    }
17}