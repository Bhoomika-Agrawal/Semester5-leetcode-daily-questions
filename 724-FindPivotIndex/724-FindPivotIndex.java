// Last updated: 7/31/2025, 2:12:46 PM
class Solution {
    public int pivotIndex(int[] nums) {
        return index(nums);
    }
    public static int index(int[] arr){
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
       
        left[0]=0;
        right[arr.length-1]=0;
        int sum_l=0;
        int sum_r=0;
        for(int i=1;i<arr.length;i++){
            sum_l=sum_l+arr[i-1];
            left[i]=sum_l;
        }
        for(int i=arr.length-2;i>=0;i--){
            sum_r=sum_r+arr[i+1];
            right[i]=sum_r;
        }
        for(int i=0;i<arr.length;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}