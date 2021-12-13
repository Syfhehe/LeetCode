package Offer_ListNode;


class Number24 {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int count1 = countLength(headA);
    int count2 = countLength(headB);
    if (count1 == 0 || count2 == 0) {
      return null;
    }
    int delta = Math.abs(count1 - count2);
    ListNode fast = count1 > count2 ? headA : headB;
    ListNode slow = count1 > count2 ? headB : headA;
    for (int i = 0; i < delta; i++) {
      fast = fast.next;
    }
    while (fast != slow) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }

  private int countLength(ListNode head) {
    int count = 1;
    while (head.next != null) {
      count++;
      head = head.next;
    }
    return count;
  }

}
