/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head != null && head.next != null) { 
            ListNode fast = head;
            ListNode slow = head;
            
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) { 
                    ListNode temp = head;
                    while (temp != slow) { 
                        temp = temp.next;
                        slow = slow.next;
                    }
                    return slow;
                }
            }
        }
        return null; 
    }
}
