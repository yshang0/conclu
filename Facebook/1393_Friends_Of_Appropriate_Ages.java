//1393_Friends_Of_Appropriate_Ages

public int numFriendRequests(int[] ages) {
    int result = 0;

    Arrays.sort(ages);

    for(int i = 0; i < ages.length; i++) {
        if (ages[i] < 15) {
            continue;
        }
        for (int j = 0; j < i; j++) {
            if(ages[j] > (int)(ages[i] * 0.5 + 7)) {
                result++;
                if(ages[j] == ages[i]) {
                    result++;
                }
            }
        }
    }
    return result;
}