package packag.start.from035.end;

public class LeetCode_048 {
	  public void rotate(int[][] matrix) {
	        //按行读转为按列读
		  /**
		   * 先交换首尾两行 再求转置
		   * 
		   */
		  for(int i=0,j=matrix.length;i<j;i++,j--) {
			  int []temp = matrix[i];
			  matrix[i] = matrix[j];
			  matrix[j] = temp;
		  }//首尾交换
		  //求转置
		  for(int i = 0;i<matrix.length;i++) {
			  for(int j = i;j<matrix.length;j++) {
				  int temp = matrix[i][j];
				  matrix[i][j] = matrix[j][i];
				  matrix[j][i] = temp;
			  }
		  }
	    }
}
