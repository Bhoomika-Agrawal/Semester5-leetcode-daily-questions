// Last updated: 7/31/2025, 2:13:52 PM
class Solution {
    public void moveZeroes(int[] nums) {
        move(nums);
    }
    public static void move(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[c]=arr[i];
                c++;
            }
        }
        while(c<arr.length){
            arr[c]=0;
            c++;
        }
    }
}