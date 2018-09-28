//920_Meeting_Rooms

public boolean canAttendMeetings(List<Interval> intervals) {
    if (intervals == null || intervals.size() == 0) {
        return true;
    }
    Collections.sort(intervals, new Comparator<Interval>() {
        public int compare(Interval a, Interval b) {
            if (a.start != b.start) {
                return a.start - b.start;
            }
            return a.end - b.end;
        }
    });
    for (int i = 0; i < intervals.size() - 1; i++) {
        if (intervals.get(i).end > intervals.get(i + 1).start) {
            return false;
        } 
    }
    return true;
    
}
//time :O(n);
//space :O(nlogn);