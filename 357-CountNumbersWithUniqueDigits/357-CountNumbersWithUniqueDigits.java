// Last updated: 7/31/2025, 2:13:40 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int ans=10;
        int start=9;
        int curr=9;
        while(n-->1){
            curr*=start;
            start--;
            ans+=curr;
        }
        return ans;
    }
}