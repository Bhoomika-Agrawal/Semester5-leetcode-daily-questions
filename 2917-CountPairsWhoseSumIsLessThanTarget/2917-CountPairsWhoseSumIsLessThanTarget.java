// Last updated: 7/31/2025, 2:11:02 PM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int i=0;
        int j=nums.size()-1;
        int count=0;
        while(i<j){
            int sum=nums.get(i)+nums.get(j);
            if(sum<target){
                count+=(j-i);
                i++;
            }else{
                j--;
            }
        }
        return count;
    }
}