package packag.start.from065.end;

public class LeetCode_073 {
	public void setZeroes(int[][] matrix) {
        int dim1 = matrix.length;
        int dim2 = matrix[0].length;
        int coor1[] = new int[dim1];
        int coor2[] = new int[dim2];
       
        for (int i = 0 ; i<dim1; i++) {
            for (int k = 0; k<dim2;k++){
                if(matrix[i][k]==0) {
                    coor1[i]=-1;
                    coor2[k]=-1;
                }
            }
        }
        for (int i = 0; i< dim1;i++) {
            if (coor1[i]==-1) {
                matrix[i]= new int[dim2];
            }
        }
        
        for (int k = 0; k< dim2;k++) {
            if (coor2[k]==-1) {
                for (int y = 0 ; y<dim1; y++) {
                    matrix[y][k]=0;
                }
            }
        }
        
}
}
