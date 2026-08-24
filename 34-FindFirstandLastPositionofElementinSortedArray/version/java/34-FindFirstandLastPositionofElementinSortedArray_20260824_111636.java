// Last updated: 8/24/2026, 11:16:36 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findFirst(nums, target);
4        int last = findLast(nums, target);
5        return new int[]{first, last};
6    }
7    
8    private int findFirst(int[] nums, int target) {
9        int left = 0, right = nums.length - 1, ans = -1;
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12            if (nums[mid] == target) {
13                ans = mid;
14                right = mid - 1; 
15            } else if (nums[mid] < target) {
16                left = mid + 1;
17            } else {
18                right = mid - 1;
19            }
20        }
21        return ans;
22    }
23    
24    private int findLast(int[] nums, int target) {
25        int left = 0, right = nums.length - 1, ans = -1;
26        while (left <= right) {
27            int mid = left + (right - left) / 2;
28            if (nums[mid] == target) {
29                ans = mid;
30                left = mid + 1; 
31            } else if (nums[mid] < target) {
32                left = mid + 1;
33            } else {
34                right = mid - 1;
35            }
36        }
37        return ans;
38    }
39}
40