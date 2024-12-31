package LeetPractices.linkedList;

public class RemoveLinkedListElements {
    /**
     * https://leetcode.com/problems/remove-linked-list-elements/description/
     * Problem 203, Easy
     * */
    public static void main(String[] args) {
        ListNode list = new ListNode(7, new ListNode(7));
        list.next.next = new ListNode(7, new ListNode(7));
        list.next.next.next = new ListNode(2, new ListNode(5));
        removeElements(list, 7);
    }
    public static ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)
            head=head.next;
        ListNode current=head;
        while(current!=null && current.next!=null) {
            if(current.next.val==val)
                current.next=current.next.next;
            else
                current=current.next;
        }
        return head;

    }
}
