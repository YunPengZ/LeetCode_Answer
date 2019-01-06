import java.util.HashSet;
import java.util.Set;

public class Long_003 {
	/***
	 * 建立滑动窗口并且建立从字符的数的映射 以便判断是否存在
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
	
}
