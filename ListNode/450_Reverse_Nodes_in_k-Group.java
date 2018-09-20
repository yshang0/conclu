//450_Reverse_Nodes_in_k-Group

public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next != null) {
            head = reverse(head, k);
        }
        return dummy.next;
    }
public ListNode reverse(ListNode head, int k) {
    ListNode next = head;
    for(int i = 0; i < k; i++) {
        if(next.next == null) {
            return next;
        }
        next = next.next;
    }
    ListNode reversed_end = head.next;
    ListNode prev = head;
    ListNode cur = head.next;
    for(int i = 0; i < k; i++) {
        
        ListNode temp = cur.next;
        cur.next = prev;
        
        prev = cur;
        cur = temp;
    }
    reversed_end.next = cur;
    head.next = prev;
    return reversed_end;
}