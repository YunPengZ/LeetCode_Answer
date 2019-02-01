package packag.start.from065.end;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LeetCode_071 {
	 public String simplifyPath(String path) {
	      	Deque<String> stack = new LinkedList<String>();
	      	Set<String> skip = new HashSet<String>(Arrays.asList("..",".",""));
	      	for(String dir:path.split("/")) {
	      		if(dir.equals("..")&&!stack.isEmpty())stack.pop();
	      		else if(!skip.contains(dir))stack.push(dir);
	      	}
	      	String res = "";
	      	for(String dir:stack)res = "/"+dir+res;
	      	return res.isEmpty()?"/":res;
	 }

	
}
