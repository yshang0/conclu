//895_Friend_Request

public int friendRequest(int[] ages) {
    int result = 0;
    for (int i = 0; i < ages.length; i++) {
        for (int j = 0; j < ages.length; j++) {
            int A = ages[i];
            int B = ages[j];
            if (i == j || B <= 0.5 * A + 7 || B > A || (B < 100 && A > 100)) {
                continue;
            }
            result++;
        }
    }
    
    return result;
}
    //time :O(n * n);
    //Space:O(1);