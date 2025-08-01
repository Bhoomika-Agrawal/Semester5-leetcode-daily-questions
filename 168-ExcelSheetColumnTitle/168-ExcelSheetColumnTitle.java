// Last updated: 7/31/2025, 2:14:33 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            int r=(columnNumber-1)%26;
            sb.append((char)(r+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return sb.reverse().toString();
    }
}