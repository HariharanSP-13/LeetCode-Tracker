// Last updated: 7/9/2026, 9:10:29 AM
class Solution {
    public int addDigits(int num) {
        int sum=0,ld;
        while(num>=10){
            sum=0;
            while(num>0){
                ld=num%10;
                num/=10;
                sum+=ld;
            }
            num=sum;
        }
        return num;
    }
}