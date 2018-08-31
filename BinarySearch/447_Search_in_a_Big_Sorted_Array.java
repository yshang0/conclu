//447_Search_in_a_Big_Sorted_Array
public class Solution {
    /*
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
     
     
    public int searchBigSortedArray(ArrayReader reader, int target) {
        int start = 0, end = 1;
        
        while(true) {
            if(reader.get(end) < target) {
                start = end;
                end = end * 2;
            } else {
                break;
            }
        }
        
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(reader.get(mid) < target) {
                start = mid;
            }
            if(reader.get(mid) >= target) {
                end = mid;
            }
        }
        
        if(reader.get(start) == target) {
            return start;
        }
        if(reader.get(end) == target) {
            return end;
        }
        return -1;
    }
}