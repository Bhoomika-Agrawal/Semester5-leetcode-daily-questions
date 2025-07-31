// Last updated: 7/31/2025, 2:13:31 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(fre[c-'a']==1){
                return i;
            }
        }
        return -1;
        
    }
}