// Last updated: 7/31/2025, 2:15:19 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=search(board,word,i,j,0);
                    if(ans==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean search(char[][] board,String word,int cr,int cc,int idx) {
		if(idx==word.length()) {
			return true;
		}
		if(cr<0 ||cc<0|| cc>=board[0].length ||cr>=board.length||word.charAt(idx)!=board[cr][cc]) {
			return false;
		}
		board[cr][cc]='*';
		int[] r= {-1,0,1,0};
		int[] c= {0,-1,0,1};
		for(int i=0;i<c.length;i++) {
			boolean ans=search(board,word,cr+r[i],cc+c[i],idx+1);
			if(ans==true) {
				return true;
			}
		}
		board[cr][cc]=word.charAt(idx);
		return false;
	}
}