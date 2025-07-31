// Last updated: 7/31/2025, 2:13:58 PM
class Solution {
    public int addDigits(int num) {
        return add(num);
    }
    public static int add(int n){
        while(n>=10){
            int s=0;
            while(n>0){
                int r=n%10;
                s=s+r;
                n=n/10;
            }
            n=s;
        }
        return n;
    }
}