// Last updated: 7/31/2025, 2:14:01 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
    }
    public static boolean search(int[][] arr, int item) {
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(arr[row][col]==item) {
				return true;
			}
			else if(arr[row][col]>item) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;
		
	}
}