// Last updated: 8/28/2026, 1:42:02 PM
1//test
2class Solution {
3    public void merge(int[] nums1, int m, int[] nums2, int n) {
4        for(int j=0,i=m;j<n;j++){
5            nums1[i]=nums2[j];
6            i++;
7        }
8        Arrays.sort(nums1);
9    }
10}