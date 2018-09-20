//786_Linked_List_Weighted_Sum_In_Reverse_Order

int result = 0;
int count = 0; 
public int weightedSumReverse(ListNode head) {
    
    helper(head);
    return result;
}

public void helper (ListNode head) {
    if (head == null) {
        return;
    }
    
    helper(head.next);
    count++;
    result += head.val * count;
}