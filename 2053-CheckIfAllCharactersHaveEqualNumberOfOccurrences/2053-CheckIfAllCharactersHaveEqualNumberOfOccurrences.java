// Last updated: 7/31/2025, 2:11:19 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
        }
        for(int i=1;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i-1);
            if(fre[c1-'a']!=fre[c2-'a']){
                return false;
            }
        }
        return true;
    }
}