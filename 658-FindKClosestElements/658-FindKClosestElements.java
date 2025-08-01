// Last updated: 7/31/2025, 2:12:52 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0;
        int end=arr.length-1;
        while(end-start>=k){
            if(Math.abs(arr[start]-x)>Math.abs(arr[end]-x)){
                start++;
            }
            else{
                end--;
            }
        }
        List<Integer> result=new ArrayList<>();
        for(int i=start;i<=end;i++){
            result.add(arr[i]);
        }
        return result;
    }
}