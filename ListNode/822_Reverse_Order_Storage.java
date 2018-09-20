//822_Reverse_Order_Storage

List<Integer> result = new ArrayList<>();
public List<Integer> reverseStore(ListNode head) {
    reverse(head);
    return result;
}
public void reverse (ListNode head) {
    if(head == null) {
        return;
    }
    reverse(head.next);
    result.add(head.val);   
}