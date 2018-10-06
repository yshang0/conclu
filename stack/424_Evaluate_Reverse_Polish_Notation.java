//424_Evaluate_Reverse_Polish_Notation


public int evalRPN(String[] tokens) {
    Stack<Integer> number = new Stack<>();
    
    for (String s : tokens) {
        if (s.equals("+")) {
            int r = number.pop();
            int l = number.pop();
            number.push(l + r);
        } else if (s.equals("-")) {
            int r = number.pop();
            int l = number.pop();
            number.push(l - r);
        } else if (s.equals("*")) {
            int r = number.pop();
            int l = number.pop();
            number.push(l * r);
        } else if (s.equals("/")) {
            int r = number.pop();
            int l = number.pop();
            number.push(l / r);
        } else {
            number.push(Integer.valueOf(s));
        }
    }
    return number.pop();
}
    //time:O(n);
    //space:O(n);