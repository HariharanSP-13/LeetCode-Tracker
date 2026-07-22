// Last updated: 7/22/2026, 5:05:10 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        int n=nums1.length+nums2.length;
4        HashSet<Integer> hs=new HashSet<>();
5        List<Integer> l=new ArrayList<>();
6        for(int num:nums1){
7            hs.add(num);
8        }
9        for(int num : nums2){
10            if(hs.contains(num)){
11                l.add(num);
12                hs.remove(num);
13            }
14        }
15        int c[]=new int[l.size()];
16        for(int i=0;i<l.size();i++){
17            c[i]=l.get(i);
18        }
19        return c;
20    }
21}