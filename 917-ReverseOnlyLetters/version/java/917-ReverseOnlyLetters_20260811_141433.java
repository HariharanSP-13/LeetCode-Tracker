// Last updated: 8/11/2026, 2:14:33 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        int i=0,j=s.length()-1;
4        char []ch=s.toCharArray();
5        while(i<j){
6            if(!Character.isLetter(ch[i]))
7                i++;
8            else if(!Character.isLetter(ch[j]))
9                j--;
10            else{
11            char temp=ch[i];
12            ch[i]=ch[j];
13            ch[j]=temp;
14            i++;
15            j--;
16            }
17        }
18        return new String(ch);
19        
20    }
21}