// Last updated: 7/31/2025, 2:14:00 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            int[] fre1=new int[26];
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                fre1[ch-'a']++;
            }
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                fre1[ch-'a']--;
            }
            for(int i=0;i<fre1.length;i++){
                if(fre1[i]!=0){
                    return false;
                }
            }
        }
       return true;
    }
}