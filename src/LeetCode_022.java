package linkedlist.leetcode.com;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_022 {
	/***
	 * 使用回溯法或者动态规划
	 * @param n
	 * @return
	 */
	List<String> result = new ArrayList<String>();
	public List<String> generateParenthesis(int n) {
        char[] chs =new char[2*n];
        generate(chs,0,n,n);
        return result;
    }
	private void generate(char[] chs, int index, int n, int n2) {
		// TODO Auto-generated method stub
		if(n2==0)result.add(new String(chs));
		if(n>0) {
			chs[index] = '(';
			generate(chs, index+1, n-1, n2);
		}
		if(n2>n) {
			chs[index] = ')';
			generate(chs, index+1, n, n2-1);
		}
		
	}
}
