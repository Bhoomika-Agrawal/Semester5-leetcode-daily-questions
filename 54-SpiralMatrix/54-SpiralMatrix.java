// Last updated: 7/31/2025, 2:15:38 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int minc=0,minr=0,maxc=matrix[0].length-1,maxr=matrix.length-1;
        int total_ele=matrix[0].length*matrix.length;
        int c=0;
        while(c<total_ele){
            for(int i=minc;i<=maxc && c<total_ele;i++){
                ans.add(matrix[minr][i]);
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<total_ele;i++){
                ans.add(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<total_ele;i--){
                ans.add(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<total_ele;i--){
                ans.add(matrix[i][minc]);
                c++;
            }
            minc++;
        }
        return ans;
    }
}