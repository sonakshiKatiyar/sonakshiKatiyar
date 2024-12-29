package LeetPractices.linkedList;

public class MiddleOfTheLinkedList {

    /**
     * https://leetcode.com/problems/middle-of-the-linked-list/description/
     * Problem : 876, Easy
     * TC:n,SC:n
     */

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2));
        list.next.next = new ListNode(4, new ListNode(3));
        middleNode(list);
    }

        public static ListNode middleNode(ListNode head) {
            if (head.next == null) {
                return head;
            }
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println(slow.val);
            return slow;
    }
}
