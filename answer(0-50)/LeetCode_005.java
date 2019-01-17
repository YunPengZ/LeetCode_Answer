
public class LeetCode_005 {
	public String LongestPlindromicSubStr(String s) {
		int maxLen = 0,start = 0,end = 0;
		String result = null;
		for(int i = 0;i<s.length();i++) {
			int num1 = expandRound(s,i,i);
			int num2 = expandRound(s,i,i+1);
			int tmpMax = Math.max(num1, num2);
			if(tmpMax>=maxLen) {
				start = i - (tmpMax-1)/2;
				end = i + tmpMax/2;
				maxLen = tmpMax;
			}
			
		}
		//return maxLen;
		return s.substring(start,end+1);
	}

	private int expandRound(String s, int left, int right) {
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}
}
