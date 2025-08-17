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
 // This solution breaks the whole list into two parts and reverses the second part of the list. And then it simply chains the whole list zig zag to meet the criteria
class Solution {
    public void reorderList(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while(second.next!=null && second.next.next!=null) {
            first=first.next;
            second=second.next.next;
        }
        ListNode reverse = reverse(first.next);
        first.next=null;

        first = head;
        while(reverse!=null) {
            ListNode temp1 = first.next;
            first.next=reverse;
            ListNode temp2= reverse.next;
            first.next.next=temp1;

            first=temp1;
            reverse=temp2;
        }
        
    }

    private ListNode reverse(ListNode head) {
        ListNode dummy = null;
        while(head!=null) {
            ListNode temp = head.next;
            head.next=dummy;
            dummy=head;
            head=temp;
        }
        return dummy;
    }
}
