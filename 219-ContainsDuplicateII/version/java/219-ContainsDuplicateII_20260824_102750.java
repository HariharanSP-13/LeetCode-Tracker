// Last updated: 8/24/2026, 10:27:50 AM
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