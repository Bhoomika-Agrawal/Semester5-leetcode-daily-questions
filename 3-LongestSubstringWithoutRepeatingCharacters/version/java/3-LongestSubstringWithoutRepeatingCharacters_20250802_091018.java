// Last updated: 8/2/2025, 9:10:18 AM
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