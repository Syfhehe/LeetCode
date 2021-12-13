package Offer_ListNode;


class Number27 {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
    while (cur != null) {
      ListNode nextNode = cur.next;// �ȱ���cur����һ���ڵ�
      cur.next = prev;// �ٽ�cur����һ���ڵ�ָ��ǰһ���ڵ�
      prev = cur;
      cur = nextNode;
    }
    return prev;
  }

  public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null) {
      return true;
    }
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

    ListNode taiListNode = reverseList(temp);
    while (head != null && taiListNode != null) {
      if (head.val != taiListNode.val) {
        return false;
      }
      head = head.next == null ? null : head.next;
      taiListNode = taiListNode.next == null ? null : taiListNode.next;
    }
    return true;
  }

}
