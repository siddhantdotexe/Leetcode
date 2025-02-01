class Solution {
    public boolean isPalindrome(ListNode head) {
        int length = getLength(head);
        ListNode temp = head;
        for (int i = 0; i < length / 2; i++) {
            temp = temp.next;
        }
        temp = reverseList(temp);
        ListNode first = head;
        while (temp != null) {
            if (first.val != temp.val) {
                return false;
            }
            first = first.next;
            temp = temp.next;
        }
        
        return true;
    }
    static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    static int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
