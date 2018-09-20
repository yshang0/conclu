//104_Merge_K_Sorted_Lists

public ListNode mergeKLists(List<ListNode> lists) {  
        if (lists == null || lists.size() == 0) {
            return null;
        }
        
        while (lists.size() > 1) {
            List<ListNode> result = new ArrayList<>();
            for (int i = 0; i + 1 < lists.size(); i += 2) {
                ListNode newnode = merge(lists.get(i), lists.get(i + 1));
                result.add(newnode);
            }
            if(lists.size() % 2 == 1) {
                result.add(lists.get(lists.size() - 1));
            }
            lists = result;
        }
        return lists.get(0);
        
    }
    
    public ListNode merge(ListNode n1, ListNode n2) {
        if(n1 == null) {
            return n2;
        }
        if(n2 == null) {
            return n1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(n1 != null && n2 != null) {
            if(n1.val >= n2.val) {
                head.next = new ListNode(n2.val);
                head = head.next;
                n2 = n2.next;
            } else {
                head.next = new ListNode(n1.val);
                head = head.next;
                n1 = n1.next;
            }
        }
        if(n2 != null) {
            head.next = n2;
        }
        if(n1 != null) {
            head.next = n1;
        }
        return dummy.next;
        
    }