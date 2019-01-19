package packag.start.from051.end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_057 {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> list = new ArrayList<Interval>();
		int n = intervals.size();
		int[] start = new int[n+1];
        int[] end = new int[n+1];
        start[0] = newInterval.start;
        end[0] = newInterval.end;
        for(int i =1;i<=n;i++) {
        	start[i] = intervals.get(i-1).start;
        	end[i] = intervals.get(i-1).end;
        }
        Arrays.parallelSort(start);
        Arrays.parallelSort(end);
        for(int i = 0,j=0;i<n+1;i++) {
        	if(i==n||start[i+1]>end[i]) {
        		list.add(new Interval(start[j],end[i]));
        		j = i+1;
        	}
        }
        return list;
    }
}
