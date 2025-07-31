// Last updated: 7/31/2025, 2:16:05 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        return remove(nums,val);
    }
    public static int remove(int[] arr,int val){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
}