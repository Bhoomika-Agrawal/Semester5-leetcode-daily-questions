// Last updated: 7/31/2025, 2:13:17 PM
class Solution {
    public int compress(char[] chars) {
        // if(chars.length==1){
        //     return 1;
        // }
        int write=0;
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                chars[write]=chars[i-1];
                write++;
                if(count>1){
                    String countstr=Integer.toString(count);
                    for(char c:countstr.toCharArray()){
                        chars[write]=c;
                        write++;
                    }
                }
                count=1;
            }
        }
        chars[write++]=chars[chars.length-1];
        if(count>1){
            String countstr=Integer.toString(count);
            for(char c:countstr.toCharArray()){
                chars[write++]=c;
            }
        }
        return write;
    }
}