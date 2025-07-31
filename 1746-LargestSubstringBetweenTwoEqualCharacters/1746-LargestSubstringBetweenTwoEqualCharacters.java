// Last updated: 7/31/2025, 2:11:26 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans=-1,n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    ans=Math.max(ans,(j-i-1));
                }
            }
        }
        return ans;
    }
}