// Last updated: 7/31/2025, 2:12:31 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return new_str(s).equals(new_str(t));
    }
    public static String new_str(String s){
        int hashcount=0;
        StringBuilder str=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                hashcount++;
                continue;
            }
            if(hashcount>0){
                hashcount--;
            }
            else{
                str.insert(0,s.charAt(i));
            }
        }
        return str.toString();
    }
}