// Last updated: 7/31/2025, 2:11:28 PM
class Solution {
    public String modifyString(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0;i<ch.length;i++){
            if (ch[i] == '?'){
                for (char j = 'a'; j <= 'c';j++){
                    if (i > 0 && ch[i-1] == j) continue; 
                    if (i < ch.length-1 && ch[i+1] == j) continue; 
                    ch[i] = j; 
                    break;
                }
            }
        }
        return new String(ch);
    }
}