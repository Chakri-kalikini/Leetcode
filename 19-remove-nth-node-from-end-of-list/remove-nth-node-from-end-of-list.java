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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = head;
        ListNode ans = start;
        int counter = 1;
        if(head.next == null){
            return null;
        }
        while(head.next != null) {
            counter++;
            head = head.next;
        }
        for(int i = 0; i< counter-n -1; i++) {
            start = start.next;
        }
        if(start == ans && counter-n == 0)
            return start.next;
        start.next = start.next.next;
        return ans;
    }
}