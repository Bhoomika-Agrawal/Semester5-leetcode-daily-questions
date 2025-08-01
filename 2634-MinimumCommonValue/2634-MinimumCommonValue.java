// Last updated: 7/31/2025, 2:11:04 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}