package packag.start.from051.end;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_054 {
	public List<Integer> spiralOrder(int[][] matrix) {
        int [][]direction = {{0,1},{1,0},{0,-1},{-1,0}};//二维数组表示方向
        List<Integer> list = new ArrayList<Integer>();
        if(matrix.length==0||matrix[0].length==0)return list;
        int row = 0,col = 0;
        int index = 0;
        int top = 0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        int iterator = 0;
        while(true&&iterator++<matrix.length*matrix[0].length) {
        	list.add(matrix[row][col]);
        	if(top==bottom&&left==right) {
        		return list;
        	}
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
        		
        	row+=direction[index][0];
        	col+=direction[index][1];
        }
        return list;
    }
}
