/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp= head;
        int size=0;
        int val=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        size--;
        while(head!=null){
            val += (int) Math.pow(2, size) * head.val;
            size--;
            head=head.next;
        }
        return val;
    }
}