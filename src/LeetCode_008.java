
public class LeetCode_008 {
	private int INT_MAX = (int)Math.pow(2, 31)-1;
	private int INT_MIN = 0- (int)Math.pow(2, 31);
	public int myAtoi(String str) {
        if(str.length()<1)return 0;
        int index = 0,sign=1,result=0;
        str = str.trim();
        if(str.charAt(index)=='+'||str.charAt(index)=='-') {
        	sign = str.charAt(index)=='+' ? 1:-1;
        	index++;
        }
        while(str.charAt(index)<='9'&&str.charAt(index)>='0') {
        	if(result<Integer.MAX_VALUE/10) {
        		result = result*10+str.charAt(index)-'0';
        	}else if(result==Integer.MAX_VALUE/10) {
        		if(sign==-1&&str.charAt(index)>'7')return Integer.MIN_VALUE;
        		if(str.charAt(index)>='7')return Integer.MAX_VALUE;
        		else return result*10+str.charAt(index)-'0';
        		
        	}else {
        		if(sign==1)return Integer.MAX_VALUE;
        		else return Integer.MIN_VALUE;
        	}
        	index++;
        	if(index>=str.length())break;
        }
        
		return sign*result;
    }
}
