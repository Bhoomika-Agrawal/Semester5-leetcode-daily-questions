// Last updated: 7/31/2025, 2:13:35 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] fre=new int[26];
        for(char ch:magazine.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            fre[ch-'a']--;
            if(fre[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}