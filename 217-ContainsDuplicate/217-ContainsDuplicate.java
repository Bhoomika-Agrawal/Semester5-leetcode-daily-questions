// Last updated: 7/31/2025, 2:14:15 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        return dup(nums);
    }
    public static boolean dup(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                return true;
            }

        }
        return false;
    }
}