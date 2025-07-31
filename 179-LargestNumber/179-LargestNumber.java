// Last updated: 7/31/2025, 2:14:28 PM
class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-i-1;j++){
                String xy=str[j]+str[j+1];
                String yx=str[j+1]+str[j];
                if(xy.compareTo(yx)<0){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        if (str[0].equals("0")) {
            return "0";
        }
        StringBuilder re=new StringBuilder();
        for(int i=0;i<str.length;i++){
            re.append(str[i]);
        }
        return re.toString();
    }
}