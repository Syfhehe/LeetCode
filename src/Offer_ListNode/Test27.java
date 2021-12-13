package Offer_ListNode;

import org.junit.jupiter.api.Test;

class Test27 {

  @Test
  void test() {
    ListNode headListNode = new ListNode(1);
    headListNode.next = new ListNode(1);
    headListNode.next.next = new ListNode(2);
    headListNode.next.next.next = new ListNode(1);
    Number27 testNumber27 = new Number27();
    testNumber27.isPalindrome(headListNode);
  }

}
