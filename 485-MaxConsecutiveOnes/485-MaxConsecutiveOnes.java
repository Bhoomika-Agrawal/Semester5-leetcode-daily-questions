// Last updated: 7/31/2025, 2:13:14 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return ones(nums);
    }
    public static int ones(int[] arr){
        int current_count=0;
        int max_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                current_count=0;
            }
            else{
                current_count++;
                max_count=Math.max(max_count,current_count);  
                
            }
        }
        return max_count;
    }
}