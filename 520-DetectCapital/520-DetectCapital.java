// Last updated: 7/31/2025, 2:13:07 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
            boolean allupper=true;
            for(int i=1;i<word.length();i++){
                if(word.charAt(i) < 'A' ||word.charAt(i) > 'Z'){
                    allupper=false;
                    break;
                }
            }
            if(allupper){
                return true;
            }
            boolean allLower = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    allLower = false;
                    break;
                }
            }
            return allLower;

        }
        else{
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                    return false;
                }
            }
            return true;
        }
    }
}