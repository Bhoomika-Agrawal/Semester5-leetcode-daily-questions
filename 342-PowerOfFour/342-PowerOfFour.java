// Last updated: 7/31/2025, 2:13:47 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        return n==1;
    }
}