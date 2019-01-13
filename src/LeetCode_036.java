package packag.start.from035.end;

import java.util.HashSet;

public class LeetCode_036 {
	 public boolean isValidSudoku(char[][] board) {
	     //��ÿһ������е�Ԫ�� ���ò�ͬ�ı�� 
		 HashSet<String> set = new HashSet<String>();
		 for(int i = 0;i<9;i++) {
			 for(int j = 0;j<9;j++) {
				 if(board[i][j]!='.') {
					//�������������߱�ʾ�� ���ұ߱�ʾ��
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
