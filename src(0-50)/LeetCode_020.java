import java.util.Stack;

public class LeetCode_020 {
	   public boolean isValid(String s) {
			 //boolean flag = true;
			 Stack sk = new Stack<Character>();
			 //Map<Character,int> left = new HashMap<Character,int>();
			// char[] left = {'(','[','{'};
			 for(Character c:s.toCharArray()) {
				 switch(c) {
					 case '(':;
					 case '[':;
					 case '{':sk.push(c);break;
					 case ')':
	                if(sk.empty())return false;
					if(sk.peek().equals('(')) {
						sk.pop();
						break;
					} else {
						return false;
					}
					 case ']':
	                     if(sk.empty())return false;
					if(sk.peek().equals('[')) {
							sk.pop();
							break;
						} else {
							return false;
						}
					 case '}':
	                     if(sk.empty())return false;
					if(sk.peek().equals('{')) {
							sk.pop();
							break;
						} else {
							return false;
						}
					 default: break;
				 }
				 
			 }
	         if(!sk.empty())return false;
			 return true;
		 }
}
