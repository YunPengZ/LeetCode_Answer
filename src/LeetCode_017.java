import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_017 {
	public List<String> letterCombinations(String digits) {
		/***
		 * 类似实现join操作、求笛卡儿积
		 */
		LinkedList<String> result = new LinkedList<String>();
		if(digits.isEmpty())return result;
		String[] str = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		result.add("");
		for(int i = 0;i<digits.length();i++){
			int index = digits.charAt(i)-'0';
			while(result.peek().length()==i) {
				String remove = result.remove();
				for(char c :str[index].toCharArray()) {
					result.add(remove+c);
				}
			}
		
		}
		return result;
        
    }
}
