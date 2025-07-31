// Last updated: 7/31/2025, 2:12:50 PM
class Solution {
    public int maximumSwap(int num) {
        char numsarr[]= Integer.toString(num).toCharArray();
        char max_ele=numsarr[numsarr.length-1];
        int maxidx=numsarr.length-1;
        int idx1=-1;
        int idx2=-1;
        for(int i=numsarr.length-1;i>=0;i--){
            if(numsarr[i]>max_ele){
                max_ele=numsarr[i];
                maxidx=i;
            }
            else if(numsarr[i]<max_ele){
                idx1=i;
                idx2=maxidx;
            }
        }
        if(idx1!=-1){
            char temp=numsarr[idx1];
            numsarr[idx1]=numsarr[idx2];
            numsarr[idx2]=temp;
        }
        return Integer.parseInt( new String(numsarr));
    }
}