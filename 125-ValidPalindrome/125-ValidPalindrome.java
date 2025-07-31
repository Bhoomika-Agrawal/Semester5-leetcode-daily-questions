// Last updated: 7/31/2025, 2:14:59 PM
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String original=sb.toString();
        String reversed=sb.reverse().toString();
        return original.equals(reversed);
    }
}