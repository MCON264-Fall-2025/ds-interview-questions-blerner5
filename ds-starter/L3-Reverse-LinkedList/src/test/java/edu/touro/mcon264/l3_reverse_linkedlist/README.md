The problem I am trying to solve is how to traverse a linked list in reverse

I assume the node values and the data will remain the same since I am not adding new nodes or changing old ones rather reversing with a pointer

Iterative is simple switching the order of the nodes instead of from going from front to back to go from back to front, the way my algorithm works is by using variable to keep track 
of which node the pointer is currently pointing to, which node the pointer was pointing to previously, and which node the pointer will be pointing to next.

The recursive algorithm keeps calling recursive.next head to move to the next head to traverse the linked list, when the whole list is traversed they switch the arrows backwards so the list is reversed
The last node becomes the new head

example

2 -> 3 -> 5 -> 6 -> 8
8 -> 6 -> 5 -> 3 -> 2