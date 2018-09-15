//30_Insert_Interval

public class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        if(intervals == null || newInterval == null) {
            return intervals;
        }
        
        List<Interval> result = new ArrayList<>();
        int pos = 0;
        
        for(Interval t : intervals) {
            if(t.end < newInterval.start) {
                result.add(t);
                pos++;
            } else if(newInterval.end < t.start) {
                result.add(t);
            } else {
                newInterval.start = Math.min(t.start, newInterval.start);
                newInterval.end = Math.max(t.end, newInterval.end);
            }
        }
        result.add(pos, newInterval);
        return result;
    }
}

  n e w 
t  t  t  t  t  t  t  t  
 =>t
 =>t        t  t  t  t  t
 =>t  new   t  t  t  t  t
 //search for the postion of newInterval while adding the item which has no overlapping;
 //in the end, insert the newInterval into the right position;