package packag.start.from035.end;

import java.util.HashSet;

public class LeetCode_036 {
	 public boolean isValidSudoku(char[][] board) {
	     //对每一大格子中的元素 设置不同的标记 
		 HashSet<String> set = new HashSet<String>();
		 for(int i = 0;i<9;i++) {
			 for(int j = 0;j<9;j++) {
				 if(board[i][j]!='.') {
					//将数字添加在左边表示行 在右边表示列
					 if(!set.add(board[i][j]+"row"+i)||
						 !set.add(board[i][j]+"column"+j)||
						 !set.add(board[i][j]+"grid"+i/3+"-"+j/3))
						 return false;
				 }
				 }
				 
		 }
		 return true;
	    }
}
