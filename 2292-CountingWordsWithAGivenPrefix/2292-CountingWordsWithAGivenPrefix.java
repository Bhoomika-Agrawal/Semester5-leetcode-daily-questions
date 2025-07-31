// Last updated: 7/31/2025, 2:11:09 PM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length();
        int c=0;
        for(String word:words){
            if(word.length()>=n && word.substring(0,n).equals(pref)){
                c++;
            }
        }
        return c;
    }
}