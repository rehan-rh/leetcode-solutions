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
        if(head==null || head.next==null)
        return head;
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
        ListNode first = head;
        ListNode second = mid.next;
        mid.next = null;
        first = sortList(first);
        second = sortList(second);
        return merge(first, second);
    }

    ListNode merge(ListNode left, ListNode right)
    {
        ListNode dummyHead = new ListNode(0);
        ListNode dummy = dummyHead;
        while(left!=null && right!=null)
        {
            if(left.val<=right.val)
            {
                dummy.next = left;
                left = left.next;
                dummy = dummy.next;
            }
            else
            {
                dummy.next = right;
                right = right.next;
                dummy = dummy.next;
            }
        }
        if(left!=null)
        {
            dummy.next = left;
        }
        if(right!=null)
        {
            dummy.next = right;
        }
        return dummyHead.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna