package linkedlist.leetcode.com;

public class LeetCode_028 {
	/***
	 * 折腾的头大 直接用indexof吧
	 * @param haystack
	 * @param needle
	 * @return
	 */
	 public int strStr(String haystack, String needle) {
		 if(needle==null||needle==""||haystack=="")return 0;
		 //kmp
		 int [] next = mknext(needle.toCharArray());
		 for(int i =0,j = 0;i<haystack.length();) {
			 //i-->s;j-->p 匹配成功 
			 if(j==-1||haystack.charAt(i)==needle.charAt(j)) {
				 if(j==needle.length())return i;
				 i++;
				 j++;
			 }if(i<haystack.length()&&haystack.charAt(i)!=needle.charAt(j))j = next[j];
			 
		 }
		 return -1;
	 }
	 
	public int[] mknext(char[] chr) {
		int len = chr.length;
		int [] result = new int[len];
		result[0] = -1;
		for(int i =0,j=-1;i+1<len;) {
			if(j==-1||chr[i]==chr[j]) {
				result[i+1] = j+1;
				if(chr[i+1] == chr[j+1]) result[i+1] = result[j+1];
				i++;j++;
			}
			if(chr[i]!=chr[j])j = result[j];
		}
		return result;
	}
}
