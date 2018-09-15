//1304_H-Index

public int hIndex(int[] citations) {
    if(citations == null || citations.length == 0) {
        return 0;
    }
    
    //when array has only one element, return 1; But when the only one element is 0, return 0;
    if(citations.length == 1) {
        if(citations[0] == 0) {
            return 0;
        }
        return 1;
    }
    Arrays.sort(citations);
    int j = 0;
    
    //deal with the first one element. when the number of least citations is greater or equal than the amount of total paper, return the amount of paper;
    if(citations[0] >= citations.length) {
        return citations.length;
    }
    
    
    for (int i = citations.length - 1; i >= 1; i--) {
        j++;
        if (i <= citations[j] && citations[j - 1] <= i) {
            return i;
        }
        
    } 
    return 0;
}