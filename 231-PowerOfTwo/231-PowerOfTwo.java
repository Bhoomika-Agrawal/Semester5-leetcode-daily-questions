// Last updated: 7/31/2025, 2:14:08 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return ispower(n);
    }
    public static boolean ispower(int n){
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n%2==1){
                return false;
            }
            else{
                n=n/2;
            }
        }
        return true;
    }
}