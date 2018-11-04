//407_Plus_One

public int[] plusOne(int[] digits) {
    int len = digits.length;
    int tenth = 1;
    
    for (int i = digits.length - 1; i >= 0; i--) {
        int sum = digits[i] + tenth;
        tenth = sum / 10;
        digits[i] = sum % 10;
    }
    if (tenth == 0) {
        return digits;
    }
    
    int[] result = new int[digits.length + 1];
    result[0] = tenth;
    for (int j = 1; j < result.length; j++) {
        result[j] = digits[j - 1];
    }
    return result;
}