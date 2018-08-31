//156_Merge_Intervals
/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                if(a.start != b.start) {
                    return a.start - b.start;
                } else {
                    return a.end - b.end;
                }
            }
        });
        if(intervals == null || intervals.size() == 0 || intervals.size() == 1) {
            return intervals;
        }
        
        List<Interval> result = new ArrayList<>();
        for(int i = 1; i < intervals.size(); i++) {
            if(intervals.get(i).start <= intervals.get(i -1).end) {
                intervals.get(i).start = intervals.get(i - 1).start;
                intervals.get(i).end = Math.max(intervals.get(i - 1).end, intervals.get(i).end);
            } else {
                result.add(intervals.get(i - 1));
            }
        }  

        // here is the point;
        //if i has overlapping with i -1, merge i with i -1
        //if i does not have overlapping with i - 1, put i -1 into result;
        //after complete the for loop, need to add the last one into result;

        
        result.add(intervals.get(intervals.size() - 1));
        return result;
    }
}