package packag.start.from065.end;

public class LeetCode_074 {
	 public boolean searchMatrix(int[][] matrix, int target) {
		 	int length_1 = matrix.length;
		 	if(length_1==0)return false;
		 	int length_2 = matrix[0].length;
			int left = 0,right = length_1*length_2-1;
			while(left<right) {
				int mid = (left+right)/2;
				if(matrix[mid/length_2][mid%length_2]<target)left = mid+1;
				else if(matrix[mid/length_2][mid%length_2]>target)right = mid-1;
				else return true;
			}
			return false;
	 }
}
