// Last updated: 7/31/2025, 2:12:33 PM
class Solution {
    public String toGoatLatin(String sentence) {
        String arr[]=sentence.split(" ");
        sentence="";
        String str="";
        for(int i=0;i<arr.length;i++){
            str+="a";
            if(Character.toLowerCase(arr[i].charAt(0))=='a' || Character.toLowerCase(arr[i].charAt(0))=='e'||Character.toLowerCase(arr[i].charAt(0))=='i'||Character.toLowerCase(arr[i].charAt(0))=='o'||Character.toLowerCase(arr[i].charAt(0))=='u'){
                sentence+=arr[i] +"ma"+str+" ";
            }
            else{
                sentence  += arr[i].substring(1)+arr[i].substring(0,1)+"ma"+str+" ";
            }
       }
       return sentence.trim();
        
    }
}