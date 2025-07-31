// Last updated: 7/31/2025, 2:14:13 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        return dup(nums,k);
    }
    public static boolean dup(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=i+k && j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                 }
            }
        }
        return false;
    }
}