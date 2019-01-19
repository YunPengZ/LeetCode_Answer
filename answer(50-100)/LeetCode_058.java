package packag.start.from051.end;

public class LeetCode_058 {
	 public int lengthOfLastWord(String s) {
	        if(s==""||s==null)return 0;
	        char[] chr = s.trim().toCharArray();
	        for(int i = chr.length-1;i>=0;i--) {
	        	if(chr[i]==' ')return chr.length-i-1;
	        }
	        return chr.length;
	    }
}	
