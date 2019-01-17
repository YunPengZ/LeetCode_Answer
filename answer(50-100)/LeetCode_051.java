package packag.start.from051.end;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_051 {
	 public List<List<String>> solveNQueens(int n) {
	        List<List<String>> list = new ArrayList<List<String>>();
	        boolean[][] visited = new boolean[n][n];
	        backtrack(list,new ArrayList<String>(),visited,0);
	        return list;
	   }

	private void backtrack(List<List<String>> list, List<String>temp,boolean[][] visited,int layer) {
		int length = visited.length;
		if(layer==length) {
			list.add(new ArrayList<String>(temp));
			return ;
		}else {
			for(int i = 0;i<length;i++) {
				if(!isValid(visited, layer, i))continue;	
				visited[layer][i] = true;
				StringBuilder tempStr = new StringBuilder();
				for(int j = 0;j<length;j++) {
					if(j==i)tempStr.append('Q');
					else tempStr.append('.');
				}
				temp.add(tempStr.toString());
				backtrack(list,temp,visited,layer+1);
				visited[layer][i] = false;
				temp.remove(temp.size()-1);
			}
		}
		
	
		// TODO Auto-generated method stub
		
	}
	private boolean isValid(boolean[][] visited,int layer,int i) {
		for(int j = 0;j<layer;j++) {
			if(visited[j][i]) {
				return false;
			}
		}
		int tempRow = layer;
		int tempColumn = i;
		int length = visited.length;
		while(tempRow++<length-1&&tempColumn++<length-1) {
			if(visited[tempRow][tempColumn]) {
				return false;
			}
		}
		tempRow = layer;tempColumn =i;
		while(tempRow-->0&&tempColumn++<length-1) {
			if(visited[tempRow][tempColumn]) {
				return false;
			}
		}
		tempRow = layer;tempColumn =i;
		while(tempRow++<length-1&&tempColumn-->0) {
			if(visited[tempRow][tempColumn]) {
				return false;
			}
		}
		tempRow = layer;tempColumn =i;
		while(tempRow-->0&&tempColumn-->0) {
			if(visited[tempRow][tempColumn]) {
				return false;
			}
		}
		return true;
	}
}
