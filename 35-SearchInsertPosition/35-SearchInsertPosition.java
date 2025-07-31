// Last updated: 7/31/2025, 2:15:56 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        return index(nums,target);
    }
    public static int index(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}