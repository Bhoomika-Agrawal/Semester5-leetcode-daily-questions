// Last updated: 7/31/2025, 2:16:24 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> window=new ArrayList<>();
        int maxlen=0;
        for(char ch:s.toCharArray()){
            if(window.contains(ch)){
                while(window.contains(ch)){
                    window.remove(0);
                }
            }
            window.add(ch);
            maxlen=Math.max(maxlen,window.size());
        }
        return maxlen;
    }
}