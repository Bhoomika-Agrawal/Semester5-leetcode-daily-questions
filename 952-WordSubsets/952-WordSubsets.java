// Last updated: 7/31/2025, 2:12:18 PM
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxfre=new int[26];
        for(String word:words2){
            //count the fre of each word
            int fre[] =countfre(word);
            for(int i=0;i<26;i++){
                //update the max fre array
                maxfre[i]=Math.max(maxfre[i],fre[i]);
            }
        }
        ArrayList<String> re=new ArrayList<>();
        for(String word:words1){
            int[] fre=countfre(word);
            if(isuniversal(fre,maxfre)){
                re.add(word);
            }
        }
        return re;
    }
    public static int[] countfre(String s){
        int fre[]=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        return fre;
    }
    public static boolean isuniversal(int[] fre,int[] maxfre){
        for(int i=0;i<26;i++){
            if(fre[i]<maxfre[i]){
                return false;
            }
        }
        return true;
    }
}