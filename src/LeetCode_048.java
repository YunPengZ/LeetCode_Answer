package packag.start.from035.end;

public class LeetCode_048 {
	  public void rotate(int[][] matrix) {
	        //���ж�תΪ���ж�
		  /**
		   * �Ƚ�����β���� ����ת��
		   * 
		   */
		  for(int i=0,j=matrix.length;i<j;i++,j--) {
			  int []temp = matrix[i];
			  matrix[i] = matrix[j];
			  matrix[j] = temp;
		  }//��β����
		  //��ת��
		  for(int i = 0;i<matrix.length;i++) {
			  for(int j = i;j<matrix.length;j++) {
				  int temp = matrix[i][j];
				  matrix[i][j] = matrix[j][i];
				  matrix[j][i] = temp;
			  }
		  }
	    }
}
