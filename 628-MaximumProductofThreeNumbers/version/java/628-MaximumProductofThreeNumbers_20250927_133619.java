// Last updated: 9/27/2025, 1:36:19 PM
class Solution {
    public int search(int[] nums, int target) {
        return Search(nums,target);
    }
    public static int Search(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=e+((s-e)/2);
            if(target==arr[mid]){
                return mid;
            }
            if (arr[s]<=arr[mid]){//left array sorted
                if(arr[s]<=target && target<=arr[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[e]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            } 
        }
         return -1;
    }
}