package Offer_ListNode;


class Number22 {
  public ListNode getNodeInListNodeLoop(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    ListNode slowNode = head.next;
    ListNode quickNode = slowNode.next;
    while (quickNode != null && slowNode != null) {
      if (quickNode == slowNode) {
        return slowNode;
      }
      quickNode = quickNode.next;
      slowNode = slowNode.next;
      if (quickNode != null) {
        quickNode = quickNode.next;
      }
    }
    return null;
  }

  public ListNode detectCycle(ListNode head) {
    ListNode inLoop = getNodeInListNodeLoop(head);
    if (inLoop == null) {
      return null;
    }
    ListNode node = head;
    while (node != inLoop) {
      node = node.next;
      inLoop = inLoop.next;
    }
    return inLoop;
  }

}
