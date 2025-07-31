// Last updated: 7/31/2025, 2:13:30 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int[] fre1=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre1[ch-'a']++;
        }
        int[] fre2=new int[26];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            fre2[ch-'a']++;
        }
        char r='0';
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(fre1[c-'a']!=fre2[c-'a']){
                r= t.charAt(i);
                break;
            }
        }
        return r;
    }
}