package Offer_ListNode;


class Number29 {

  public Node insert(Node head, int insertVal) {
    Node newNode = new Node(insertVal);
    if (head == null) {
      head = newNode;
      head.next = head;
    } else if (head.next == head) {
      head.next = newNode;
      newNode.next = head;
    } else {
      insertCore(head, newNode);
    }
    return head;
  }

  private void insertCore(Node head, Node newNode) {
    Node cur = head;
    Node next = head.next;
    Node biggest = head;
    while (!(cur.val <= newNode.val && next.val >= newNode.val) && next != head) {
      cur = next;
      next = next.next;
      if (cur.val >= biggest.val) {
        biggest = cur;
      }
    }
    if (cur.val <= newNode.val && next.val >= newNode.val) {
      cur.next = newNode;
      newNode.next = next;
    } else {
      newNode.next = biggest.next;
      biggest.next = newNode;
    }

  }


}
