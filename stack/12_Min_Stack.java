//12_Min_Stack

public class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        s1.push(number);
        if(s2.isEmpty()) {
            s2.push(number);
        } else {
            s2.push(Math.min(s2.peek(), number));
        }
    }

    /*
     * @return: An integer
     */
    public int pop() {
        s2.pop();
        return s1.pop();
    }

    /*
     * @return: An integer
     */
    public int min() {
        return s2.peek();
    }
}