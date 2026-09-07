// Last updated: 9/7/2026, 4:27:09 PM
1import java.util.*;
2class Solution {
3    public boolean containsNearbyDuplicate(int[] nums, int k) {
4        Set<Integer> set = new HashSet<>();
5        for (int i = 0; i < nums.length; i++) {
6            if (i > k) {
7                set.remove(nums[i - k - 1]);
8            }
9            if (!set.add(nums[i])) {
10                return true;
11            }
12        }
13        return false;
14    }
15}