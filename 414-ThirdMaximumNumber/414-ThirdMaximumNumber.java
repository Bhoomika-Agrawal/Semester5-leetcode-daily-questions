// Last updated: 7/31/2025, 2:13:24 PM
class Solution {
    public int thirdMax(int[] nums) {
        return thirdmax(nums);
    }
    public static int thirdmax(int[] arr){
        Arrays.sort(arr);
        int max=0;
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[c]=arr[i];
                c++;
            }
        }
        if(c>=3){
            max=arr[c-3];
        }
        else{
            max=arr[c-1];
        }
        return max;
    }
}