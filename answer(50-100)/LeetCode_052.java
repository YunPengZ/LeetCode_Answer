package packag.start.from051.end;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_052 {
	 public int totalNQueens(int n) {
	        List<List<String>> list = new ArrayList<List<String>>();
		        boolean[][] visited = new boolean[n][n];
		        backtrack(list,new ArrayList<String>(),visited,0);
		        return list.size();
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
		private boolean isValid(boolean[][] visited,int layer,int column) {
			for(int i = 0;i<layer;i++) {
				for(int j = 0;j<visited.length;j++) {
					if(visited[i][j]&&(layer+j==column+i
							||layer+column==i+j||column==j))return false;
				}
			}
			return true;
		}
}
