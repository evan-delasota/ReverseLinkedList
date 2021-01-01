
// Not a complete list implementation, just highlights the algorithm itself
class ListNode {
  int val;
  ListNode next;

  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next;
        ListNode previous = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous; 
          
  }
}