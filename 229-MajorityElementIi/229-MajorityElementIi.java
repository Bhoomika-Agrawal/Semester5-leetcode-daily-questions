// Last updated: 7/31/2025, 2:14:10 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList <Integer> re=new ArrayList<>();
        int majority=nums.length/3;
        Arrays.sort(nums);
        int y=1;
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                y++;
            }
            else{
                if(y>majority){
                    re.add(nums[i]);
                }
                y=1;
            }
        }
        if(y>majority){
            re.add(nums[i]);
        }
        return re;
    }
}