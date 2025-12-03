package edu.touro.mcon264.l3_reverse_linkedlist;

public class Solution {
    public LLNode reverseIterative(LLNode head) {
        LLNode prev = null;
        LLNode curr = head;

        while (curr != null) {
            LLNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    code for the recursive approach

    public LLNode reverseRecursive(LLNode head) {
        if (head == null || head.next == null) return head;

        LLNode newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    // TODO: Implement solution for: Reverse a Linked List (Iterative and Recursive)
}