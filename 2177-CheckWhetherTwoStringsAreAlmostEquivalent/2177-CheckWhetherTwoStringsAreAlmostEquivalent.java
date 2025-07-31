// Last updated: 7/31/2025, 2:11:18 PM
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] fre1=new int[26];
        int[] fre2=new int[26];
        for(char ch:word1.toCharArray()){
            fre1[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            fre2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if((Math.abs(fre2[i]-fre1[i]))>3){
                return false;
            }
        }
        return true;
        
    }
}