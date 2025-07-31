// Last updated: 7/31/2025, 2:13:55 PM
class Solution {
    public int hIndex(int[] citations) {
        int start=0;
        int end=citations.length-1;
        int ans=0;
        while(start<=end){
            int mid = start+((end-start)/2);
            int no_of_pprs=citations.length-mid;
            if(citations[mid]>=no_of_pprs){
                ans=citations.length-mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}