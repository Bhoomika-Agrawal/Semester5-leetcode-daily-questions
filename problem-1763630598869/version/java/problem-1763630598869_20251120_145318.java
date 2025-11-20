// Last updated: 11/20/2025, 2:53:18 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        int[] rowHasOne = new int[R];
        int[] colHasOne = new int[C];

        // Row-wise OR
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                rowHasOne[i] |= grid[i][j];
            }
        }

        // Column-wise OR
        for (int j = 0; j < C; j++) {
            for (int i = 0; i < R; i++) {
                colHasOne[j] |= grid[i][j];
            }
        }

        // Find first & last row with 1
        int top = 0, bottom = R - 1;
        while (rowHasOne[top] == 0) top++;
        while (rowHasOne[bottom] == 0) bottom--;

        // Find first & last column with 1
        int left = 0, right = C - 1;
        while (colHasOne[left] == 0) left++;
        while (colHasOne[right] == 0) right--;

        // Area
        return (bottom - top + 1) * (right - left + 1);
    }
}
