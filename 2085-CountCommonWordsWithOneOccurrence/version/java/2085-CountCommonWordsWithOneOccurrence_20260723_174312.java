// Last updated: 7/23/2026, 5:43:12 PM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3       int c=0;
4        for(int i=0;i<words1.length;i++){
5        int c1=0;
6        int c2=0;
7            for(int j=0;j<words1.length;j++){
8                if(words1[i].equals(words1[j])){
9                    c1++;
10                }
11            }
12            for(int j=0;j<words2.length;j++){
13                if(words1[i].equals(words2[j])){
14                    c2++;
15                }
16            }
17            
18        if(c1==1&&c2==1)
19            c++;
20        }
21        
22        return c;
23    }
24}