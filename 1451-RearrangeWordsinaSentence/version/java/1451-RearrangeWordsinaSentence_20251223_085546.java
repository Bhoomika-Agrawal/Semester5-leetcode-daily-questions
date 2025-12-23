// Last updated: 12/23/2025, 8:55:46 AM
1class Solution {
2    public String arrangeWords(String text) {
3        String[] str=text.split(" ");
4        Arrays.sort(str,(a,b)->(a.length()-b.length()));
5        String ans=str[0];
6        for(int i=1; i<str.length; i++){
7            ans+=" "+str[i];
8        }
9        return Character.toUpperCase(ans.charAt(0)) + (ans.substring(1)).toLowerCase();
10    }
11}