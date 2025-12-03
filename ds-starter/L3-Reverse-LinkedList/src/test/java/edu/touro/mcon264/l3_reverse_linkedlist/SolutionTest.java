package edu.touro.mcon264.l3_reverse_linkedlist;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void testPlaceholder() {
        @Testpublic void testReverseRecursive_SingleNode() {
            LLNode head = new LLNode(42, null);
            LLNode reversed = reverseRecursive(head);
            assertEquals(42, reversed.val);
            assertNull(reversed.next);
        }

        @Testpublic void testReverseIterative_EmptyList() {
            LLNode head = null;
            LLNode reversed = reverseIterative(head);
            assertNull(reversed);
        }
        // TODO: Add tests for Reverse a Linked List (Iterative and Recursive)
    }
}