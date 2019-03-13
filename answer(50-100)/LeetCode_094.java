package packag.start.from081;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode_094 {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> list = new ArrayList<Integer>();
	        //ÖÐÐò±éÀú
	        if(root==null)return list;
	        TreeNode p = root;
	        Stack<TreeNode> s = new Stack<TreeNode>();
	        while(p!=null||!s.isEmpty()) {
	        	while(p!=null) {
	        		s.push(p);
	        		p = p.left;
	        	}
	        	p = s.pop();
	        	list.add(p.val);
	        	p = p.right;
	        }
	        return list;
	    }
}
