// Last updated: 7/31/2025, 2:12:40 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int ans=-1;
        while(start<=end){
            int mid=mid=end+((start-end)/2);
            if(letters[mid]<=target){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        if(ans==-1){
            return letters[0];
        }
        else{
            return letters[ans];
        }
    }
}