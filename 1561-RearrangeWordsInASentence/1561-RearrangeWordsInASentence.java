// Last updated: 7/31/2025, 2:11:31 PM
class Solution {
    public String arrangeWords(String text) {
        String[] str=text.split(" ");
        Arrays.sort(str,(a,b)->(a.length()-b.length()));
        String ans=str[0];
        for(int i=1; i<str.length; i++){
            ans+=" "+str[i];
        }
        return Character.toUpperCase(ans.charAt(0)) + (ans.substring(1)).toLowerCase();
    }
}