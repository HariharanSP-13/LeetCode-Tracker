// Last updated: 7/9/2026, 9:10:41 AM
class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] nonPrime = new boolean[n];
        nonPrime[1] = true;
        int numNonPrimes = 1;
        for (int i=2; i < n; i++) { 
            if (nonPrime[i]) continue;
            int j = i * 2;
            while (j < n) { 
                if (!nonPrime[j]) {
                    nonPrime[j] = true;
                    numNonPrimes++;
                }
                j += i;
            }
        }
        return (n-1) - numNonPrimes;
    }
}