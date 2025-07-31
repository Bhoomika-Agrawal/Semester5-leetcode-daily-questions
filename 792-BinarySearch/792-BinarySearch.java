// Last updated: 7/31/2025, 2:12:38 PM
class Solution {
    public int search(int[] nums, int target) {
         return Search(nums,target);
    }
    public static int Search(int[] arr, int item){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]>item){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}