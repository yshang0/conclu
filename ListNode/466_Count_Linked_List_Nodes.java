//466_Count_Linked_List_Nodes

public class Solution {
    /**
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        int result = 0;
        ListNode cur = head;
        while(cur != null) {
            result++;
            cur = cur.next;
        }
        return result;
    }
}