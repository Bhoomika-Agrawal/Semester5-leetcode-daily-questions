// Last updated: 7/31/2025, 2:11:41 PM
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        if(s.length()==k) return true;
        int[] fre=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        int odd_c=0;
        for(int count:fre){
            if(count%2==1){
                odd_c++;
            }
        }
        return odd_c<=k;
    }
}