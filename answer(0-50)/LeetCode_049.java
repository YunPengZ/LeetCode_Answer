package packag.start.from035.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode_049 {
	 public List<List<String>> groupAnagrams(String[] strs) {
	     List<List<String>> list = new ArrayList<List<String>>();  
		 HashMap<String,List<String>> map= new HashMap<String,List<String>>();
	     for(String str:strs) {
	        	//for(char c:str.toCharArray()) {
	        	char[] cstr = str.toCharArray();
	        	Arrays.sort(cstr);
	        	//String s = cstr.toString();
	        	String s = String.valueOf(cstr);
	        	if(map.containsKey(s)) {
	        		List<String> strList = map.get(s);
	        		strList.add(str);
	        		map.put(s, strList);
	        	}else {
	        		List<String> strList = new ArrayList<String>();
	        		strList.add(str);
	        		map.put(s, strList);
	        		//map.add(s,strList);
	        	}
	        	//set.add(cstr.toString());
	        }
	     for(String key:map.keySet()) {
	    	 list.add(map.get(key));
	     }
	     return list;
	  }
}
