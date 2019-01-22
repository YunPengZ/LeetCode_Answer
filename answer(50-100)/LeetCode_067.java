package packag.start.from065.end;

public class LeetCode_067 {
	 public String addBinary(String a, String b) {
		 int len1 = a.length();
		 int len2 = b.length();
		 int index1=len1-1,index2=len2-1;
		 int carry = 0;
		 StringBuilder sb = new StringBuilder();
		 
		 while(index1>=0&&index2>=0) {
			 int temp = a.charAt(index1)-'0'+b.charAt(index2)-'0'+carry;
			 sb.append(temp<2?temp:temp%2);
			 carry = temp<2?0:1;
			 index1--;index2--;
		 }
		 while(index1>=0) {
			 int temp = a.charAt(index1)-'0'+carry;
			 sb.append(temp<2?temp:temp%2);
			 carry = temp<2?0:1;
			 index1--;
		 }
		 while(index2>=0) {
			 int temp = b.charAt(index2)-'0'+carry;
			 sb.append(temp<2?temp:temp%2);
			 carry = temp<2?0:1;
			 index2--;
		 }
		 if(carry==1)sb.append(1);
		 return sb.reverse().toString();
	 }
}
