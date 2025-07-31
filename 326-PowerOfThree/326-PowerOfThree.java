// Last updated: 7/31/2025, 2:13:50 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}