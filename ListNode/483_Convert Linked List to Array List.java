//483_Convert Linked List to Array List

public class Solution {
    /**
     * @param head: the head of linked list.
     * @return: An integer list
     */
    public List<Integer> toArrayList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode cur = head;
        while(cur != null) {
            result.add(cur.val);
            cur = cur.next;
        }
        return result;
    }
}