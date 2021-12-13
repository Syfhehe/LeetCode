package Offer_ListNode;


class Number25 {
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode nextNode = cur.next;
      cur.next = prev;
      prev = cur;
      cur = nextNode;
    }
    return prev;
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    l1 = reverseList(l1);
    l2 = reverseList(l2);
    ListNode addListNode = addList(l1, l2);
    return reverseList(addListNode);
  }

  private ListNode addList(ListNode head1, ListNode head2) {
    ListNode dummy = new ListNode(0);
    ListNode sumNode = dummy;
    int carry = 0;
    while (head1 != null || head2 != null) {
      int sum = (head1 == null ? 0 : head1.val) + (head2 == null ? 0 : head2.val) + carry;
      carry = sum >= 10 ? 1 : 0;
      sum = sum >= 10 ? sum - 10 : sum;
      sumNode.next = new ListNode(sum);
      sumNode = sumNode.next;
      head1 = head1 == null ? null : head1.next;
      head2 = head2 == null ? null : head2.next;
    }
    if (carry > 0) {
      sumNode.next = new ListNode(carry);
    }
    return dummy.next;
  }

}
