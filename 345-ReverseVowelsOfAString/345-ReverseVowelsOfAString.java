// Last updated: 7/31/2025, 2:13:43 PM
class Solution {
    public String reverseVowels(String s) {
        int st=0;
        int end=s.length()-1;
        StringBuilder str=new StringBuilder(s);
        while(st<end){
            if(!isvowel(s.charAt(st))){
                st++;
            }
            if(!isvowel(s.charAt(end))){
                end--;
            }
            if (isvowel(s.charAt(st)) && isvowel(s.charAt(end))) {
                char temp = str.charAt(st);
                str.setCharAt(st, s.charAt(end));
                str.setCharAt(end, s.charAt(st));
                st++;
                end--;
            }
        }
        return str.toString();
    }
    public static boolean isvowel(char c) {
        c=Character.toLowerCase(c); 
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}