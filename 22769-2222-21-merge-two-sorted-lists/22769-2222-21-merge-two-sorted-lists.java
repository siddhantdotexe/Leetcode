class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0); 
        ListNode listhead = list;
        ListNode head1 = list1;
        ListNode head2 = list2;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                listhead.next = head1; 
                head1 = head1.next; 
            } else {
                listhead.next = head2;
                head2 = head2.next;
            }
            listhead = listhead.next; 
        }
        if (head1 != null) {
            listhead.next = head1;
        } else {
            listhead.next = head2;
        }

        return list.next;
    }
}
