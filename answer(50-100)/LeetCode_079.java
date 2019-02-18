package packag.start.from065.end;

public class LeetCode_079 {
	 public boolean exist(char[][] board, String word) {
		char[] w = word.toCharArray();
		for(int y = 0;y<board.length;y++) {
			for(int x = 0;x<board[y].length;x++) {
				if(exists(board,y,x,w,0))return true;
			}
		}
		return false;
	 }

	private boolean exists(char[][] board, int y, int x, char[] w, int i) {
		// TODO Auto-generated method stub
		if(i==w.length)return true;
		if(y<0||x<0||y==board.length||x==board[y].length)return false;
		if(board[y][x]!=w[i])return false;
		board[y][x]^=256;
		boolean exist = exists(board,y,x+1,w,i+1)
				||exists(board,y,x-1,w,i+1)
				||exists(board,y-1,x,w,i+1)
				||exists(board,y+1,x,w,i+1);
		board[y][x] ^=256;
		
		return exist;
	}
}
