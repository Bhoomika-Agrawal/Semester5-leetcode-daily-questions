// Last updated: 7/31/2025, 2:13:12 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] arr=new int[mat.length*mat[0].length];
        int i=0;
        int m=mat.length,n=mat[0].length;
        boolean up=true;
        int row=0;
        int col=0;
        while(row<m && col<n){
            if(up==true){
                while(row>0 && col<n-1){
                    arr[i]=mat[row][col];
                    i++;
                    row--;
                    col++;
                }
                arr[i]=mat[row][col];
                i++;
                if(col==n-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            else{
                while(row<m-1 && col>0){
                    arr[i]=mat[row][col];
                    i++;
                    col--;
                    row++;
                }
                arr[i]=mat[row][col];
                i++;
                if(row==m-1){
                    col++;
                }
                else{
                    row++;
                }
            }
            up=!up;
        }
        return arr;
    }
}