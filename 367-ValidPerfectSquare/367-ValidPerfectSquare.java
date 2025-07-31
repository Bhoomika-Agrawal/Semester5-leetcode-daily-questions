// Last updated: 7/31/2025, 2:13:38 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        while(start<=end){
            long mid=end+((start-end)/2);
            if(mid*mid>num){
                end=mid-1;
            }
            else if(mid*mid<num){
                start=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}