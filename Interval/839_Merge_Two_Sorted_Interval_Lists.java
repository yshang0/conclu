//839_Merge_Two_Sorted_Interval_Lists

public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
        List<Interval> result = new ArrayList<>();
        
        if(list1 == null || list1.size() == 0) {
            return list2;
        }
        if(list2 == null || list2.size() == 0) {
            return list1;
        }
        
        int l1 = 0, l2 = 0;
        int s1 = list1.size(), s2 = list2.size();
        
        while(l1 < s1 || l2 < s2) {
            if(l1 == s1) {
                result.add(list2.get(l2++));
                continue;
            } else if(l2 == s2) {
                result.add(list1.get(l1++));
                continue;
            }
            
            Interval inter1 = list1.get(l1);
            Interval inter2 = list2.get(l2);
            if(inter1.end < inter2.start) {
                result.add(inter1);
                l1++;
                continue;
            } 
            if(inter2.end < inter1.start) {
                result.add(inter2);
                l2++;
                continue;
            }
            if(inter2.end >= inter1.end) {
                inter2.start = Math.min(inter1.start, inter2.start);
                l1++;
                continue;
            }
            if(inter2.end < inter1.end) {
                inter1.start = Math.min(inter1.start, inter2.start);
                l2++;
                continue;
            }
        }
        
        return result;
        
    }