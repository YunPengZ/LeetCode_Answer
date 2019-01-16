package packag.start.from035.end;

public class LeetCode_043 {
	public String multiply(String num1,String num2) {
		if(num1.charAt(0)=='0'||num2.charAt(0)=='0')return "0";
		String result = "";
		//i,j--max-->i+j
		int m = num1.length(), n = num2.length();
		int []nums= new int[m+n];
		int carry = 0;
		for(int i = num1.length()-1;i>=0;i--) {
			for(int j = num2.length()-1;j>=0;j--) {
				int temp = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				int p1 = i+j,p2 = i+j+1;
				int sum = temp+nums[p2];
				nums[p1] += sum/10;
				nums[p2] = sum%10;
				//result = temp%10+result;
				
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int p:nums)if(!(sb.length()==0&&p==0))sb.append(p);
		return sb.toString();
	}
}
