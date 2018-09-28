//167_Add_Two_Numbers

public ListNode addLists(ListNode l1, ListNode l2) {
        
    if (l1 == null && l2 == null) {
        return new ListNode(0);
    }
    
    ListNode c1 = l1;
    ListNode c2 = l2;
    int tenth = 0;
    
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    
    
    while (c1 != null || c2 != null) {
        int v1 = 0, v2 = 0;
        if (c1 != null) {
            v1 = c1.val;
        }
        if (c2 != null) {
            v2 = c2.val;
        }
        cur.next = new ListNode ((v1 + v2 + tenth) % 10);
        tenth = (v1 + v2 + tenth) / 10;
        cur = cur.next;
        if (c1 != null) {
            c1 = c1.next;
        }
        if (c2 != null) {
            c2 = c2.next;
        }
        
    }
    if (tenth != 0) {
        cur.next = new ListNode (tenth);
    }
    return dummy.next;

    //Time :O(Math.max(c1.length, c2.length));
    //space: O(Math.max(c1.length, c2.length));


}