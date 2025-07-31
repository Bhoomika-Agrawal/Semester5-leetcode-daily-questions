// Last updated: 7/31/2025, 2:11:13 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        return pivot(nums,pivot);
    }
    public static int[] pivot(int[] arr,int item){
        int[] ans=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<item){
                ans[idx++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                ans[idx++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>item){
                ans[idx++]=arr[i];
            }
        }
        return ans;
    }
}