// Last updated: 7/31/2025, 2:10:53 PM
class Solution {
    public int maxDifference(String s) {
        int[] fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
        }
        int odd=Integer.MIN_VALUE;
        int even=Integer.MAX_VALUE;
        for(int f:fre){
            if(f>0){
                if(f%2==1){
                    odd=Math.max(odd,f);
                }
                else{
                    even=Math.min(even,f);
                }
            }
        }
        if(odd==Integer.MAX_VALUE || even==Integer.MIN_VALUE){
            return 0;
        }
        return odd-even;
    }
}