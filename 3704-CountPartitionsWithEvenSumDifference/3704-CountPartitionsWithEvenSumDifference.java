// Last updated: 7/31/2025, 2:10:54 PM
class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int k=0;k<nums.length;k++){
            total+=nums[k];
        }
        int c=0;
        int i=0;
        int j=i+1;
        int sum1=0;
        while(i<j && j<nums.length){
            sum1+=nums[i];
            int diff=2*sum1-total;
            if(diff%2==0){
                c++;
            }
            i++;
            j++;
        }
        return c;
    }
}