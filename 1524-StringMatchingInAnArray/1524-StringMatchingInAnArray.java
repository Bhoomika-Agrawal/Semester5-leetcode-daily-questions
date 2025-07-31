// Last updated: 7/31/2025, 2:11:38 PM
class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> re=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(check(words,words[i],i)){
                re.add(words[i]);
            }
        }
        return re;
    }
    public static boolean check(String[] words, String substr,int idx){
        for(int j=0;j<words.length;j++){
            if(idx==j) continue;
            if(words[j].contains(substr)){
                return true;
            }
        }
        return false;
    }
}