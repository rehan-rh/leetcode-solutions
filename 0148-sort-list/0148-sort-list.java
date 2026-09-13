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
    ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid = middle(head);
        ListNode fh = head;
        ListNode sh = mid.next;
        mid.next = null;
        fh = sortList(fh);
        sh = sortList(sh);
        return merge(fh, sh);
        
    }
    ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode dummyHead = new ListNode(0);
        ListNode dummy = dummyHead;
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        while(curr1!=null && curr2!=null)
        {
            if(curr1.val<curr2.val)
            {
                dummy.next = curr1;
                curr1 = curr1.next;
            }
            else
            {
                dummy.next = curr2;
                curr2 = curr2.next;
            }
            dummy = dummy.next;
        }
        if(curr1!=null) dummy.next = curr1;
        if(curr2!=null) dummy.next = curr2;
        return dummyHead.next;
    }
}