// Last updated: 7/31/2025, 2:13:42 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] small=nums1.length<nums2.length ? nums1 :nums2;
        int[] large=nums2.length>nums1.length ? nums2 :nums1;

        ArrayList<Integer>larger=new ArrayList<>();
        for(int num:large){
            larger.add(num);
        }
        ArrayList<Integer>intersect=new ArrayList<>();
        for(int num:small){
            if(larger.contains(num)&& !intersect.contains(num)){
                intersect.add(num);
                larger.remove((Integer)num);
            }
        }
        int[] result=new int[intersect.size()];
        for(int i=0;i<intersect.size();i++){
            result[i]=intersect.get(i);
        }
        return result;
    }

}