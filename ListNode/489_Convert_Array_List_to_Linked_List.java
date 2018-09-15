//489_Convert_Array_List_to_Linked_List


public class Solution {
    /*
     * @param nums: an integer array
     * @return: the first node of linked list
     */
    public ListNode toLinkedList(List<Integer> nums) {
        if(nums == null || nums.size() == 0) {
            return null;
        }
        ListNode head = new ListNode(nums.get(0));
        ListNode cur = head;
        for (int i = 1; i < nums.size(); i++) {
            cur.next = new ListNode(nums.get(i));
            cur = cur.next;
        }
        return head;
    }
}