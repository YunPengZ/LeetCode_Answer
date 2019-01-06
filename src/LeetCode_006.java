import java.util.ArrayList;
import java.util.List;

public class LeetCode_006 {
	public String conversion(String s,int numRows) {
		if(s.length()<numRows||numRows<=1)return s;
		List<StringBuilder> rows = new ArrayList<StringBuilder>();
		for(int i = 0;i<s.length();i++) {
			rows.add(new StringBuilder());
		}
		int curRow = 0;
		boolean goingDown = false;
		for(char c:s.toCharArray()) {
			rows.get(curRow).append(c);
			if(curRow == 0 || curRow == numRows -1)goingDown = !goingDown;
			curRow +=goingDown?1:-1;
		}
		
		StringBuilder ret = new StringBuilder();
		for(StringBuilder row:rows)ret.append(row);
		//System.out.println(ret.append("\n"));
		return ret.toString();
	}
}
