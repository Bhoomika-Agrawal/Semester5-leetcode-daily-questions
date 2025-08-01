// Last updated: 7/31/2025, 2:12:12 PM
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0, n = name.length(), m = typed.length();
        for(int j=0; j<m; j++){
            if(i<n && name.charAt(i)==typed.charAt(j)){
                i++;
            }
            else if(j == 0 || typed.charAt(j)!=typed.charAt(j-1)){
                return false;
            }
        }
        return i==n;
    }
}