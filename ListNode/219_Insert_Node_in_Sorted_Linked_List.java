//219_Insert_Node_in_Sorted_Linked_List

public class Solution {
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        
        while(cur != null) {
            if(cur.val >= val) {
                break;
            }
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = new ListNode(val);
        pre.next.next = cur;
        return dummy.next;
    }
}