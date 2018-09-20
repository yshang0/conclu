//36_Reverse_Linked_List_II

public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = head;
    ListNode prev = dummy;
    int count = 1;
    
    while(count != m && cur != null) {
        count++;
        cur = cur.next;
        prev = prev.next;
    }
    
    ListNode begin_unreversed = prev;
    ListNode end_reversed = cur;
    prev = cur;
    cur = cur.next;
    for(int i = 1; i <= n - m; i++) {
        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;
        cur = temp;
    }
    begin_unreversed.next = prev;
    end_reversed.next = cur;
    return dummy.next;
    
}