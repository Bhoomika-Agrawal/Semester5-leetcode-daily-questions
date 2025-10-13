// Last updated: 10/13/2025, 7:37:46 PM
class Solution {
    public boolean winnerOfGame(String s) {
        //here we count valid AAA and BBB if counta>countb alice wins otherwise bob wins
        int a=0,b=0;
        for(int i=1;i<=s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)==s.charAt(i+1)){
                if(s.charAt(i)=='A'){
                    a++;
                }
                else{
                    b++;
                }
            }
        }
        return a>b;
    }
}