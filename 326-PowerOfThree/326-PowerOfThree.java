// Last updated: 7/9/2026, 9:10:25 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
    }
}