package packag.start.from051.end;

public class LeetCode_059 {
	public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int dir[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int row=0,col=0;
        int index = 0;
        int iterator =0;
        int left = 0,top = 0,right = n-1,bottom = n-1;
        while(++iterator<=n*n) {
        	res[row][col] = iterator;
        	switch(index) {
        	case 0:index =(index+ (col==right?1:0))%4;
        			top = top+(col==right?1:0);
        			break;
        	case 1:index =(index+(row==bottom?1:0))%4;
        			right = right+(row==bottom?-1:0);
        			break;
        	case 2:index = (index+(col==left?1:0))%4;
        			bottom = bottom+(col==left?-1:0);
        			break;
        	case 3:index = (index+(row==top?1:0))%4;
        			left = left+(row==top?1:0);
        			break;
        	}
        	row +=dir[index][0];
        	col +=dir[index][1];
        }
        return res;
    }
}
