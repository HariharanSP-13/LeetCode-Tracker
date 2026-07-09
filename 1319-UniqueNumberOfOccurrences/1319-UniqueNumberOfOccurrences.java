// Last updated: 7/9/2026, 9:10:03 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int []counts=new int[arr.length];
        int countsIndex = 0;
        int i = 0;
        while (i < arr.length) {
            int currentNum = arr[i];
            int currentCount = 0;
            while (i < arr.length && arr[i] == currentNum) {
                currentCount++;
                i++;
            }
            counts[countsIndex++] = currentCount;
        }
        Arrays.sort(counts, 0, countsIndex);

        for (int j = 1; j < countsIndex; j++) {
            if (counts[j] == counts[j-1]) {
                return false;
            }
        }
        return  true;
    }
}