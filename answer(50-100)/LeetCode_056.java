package packag.start.from051.end;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCode_056 {
	public List<Interval> merge(List<Interval> intervals) {
		//合并具有重叠部分的区间,先对intervals排序，按照
		if(intervals.size()<=1)return intervals;
		
		/*intervals.sort(new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				
				return o1.start>o2.start?1:-1;
			}
			
		});*/
		List<Interval> list = new ArrayList<Interval>();
		Interval pre = intervals.get(0);
		for(Interval interval:intervals) {
			if(interval.start<pre.start) {
				pre.start = interval.start;
				pre.end = Math.max(pre.end, interval.end);
				continue;
			}
			if(pre.end>=interval.start) {
				pre.end = interval.end;
				if(interval==intervals.get(intervals.size()-1)) {
                    list.add(pre);
             
                }
				//pre = interval;
			}else {
				//if(pre.end==0)continue;
				list.add(pre);
				pre = interval;
				if(interval==intervals.get(intervals.size()-1)) {
					list.add(interval);
					//return list;
				}
			}
		}
		return list;
    }
}
