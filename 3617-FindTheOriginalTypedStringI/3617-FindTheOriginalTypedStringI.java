// Last updated: 7/31/2025, 2:10:56 PM
class Solution {
    public int possibleStringCount(String word) {
        int ans = 0;
        char prev = word.charAt(0);
        for(int i=1; i<word.length(); i++){
            if(word.charAt(i)==prev){
                ans++;
            }
            else{
                prev = word.charAt(i);
            }
        }
        return ans+1;
    }
}