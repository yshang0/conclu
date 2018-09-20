//102_Linked_List_Cycle

public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null) {
        return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    
    while (fast != null && fast.next != null) {
        if(fast == slow) {
            return true;
        }
        fast = fast.next.next;
        slow = slow.next;
    }
    return false;
    
}

public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null) {
        return false;
    }
    
    ListNode slow = head;
    ListNode fast = head.next;
    while(slow != fast) {
        if(fast.next == null || fast.next.next == null) {
            return fasle;
        }
        fast = fast.next.next;
        slow = slow.next;
    }
    return true;
}