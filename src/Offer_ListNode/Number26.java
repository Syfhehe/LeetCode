package Offer_ListNode;


class Number26 {
  
  public void reorderList(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy;
    ListNode slow = dummy;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
      if (fast != null) {
        fast = fast.next;
      }
    }
    ListNode temp = slow.next;
    slow.next = null;
    link(head, reversedList(temp), dummy);

  }

  private void link(ListNode node1, ListNode node2, ListNode head) {
    ListNode prev = head;
    while (node1 != null && node2 != null) {
      ListNode temp = node1.next;
      prev.next = node1;
      node1.next = node2;
      prev = node2;
      node1 = temp;
      node2 = node2.next;
    }
    if (node1 != null) {
      prev.next = node1;
    }
  }

  private ListNode reversedList(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }
}
