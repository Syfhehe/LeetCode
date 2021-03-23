package DataStructure.Node;

public class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
  }

  public Node next() {
    return this.next;
  }

  public int getData() {
    return this.data;
  }

  public Node append(Node node) {
    Node currentNode = this;
    while (true) {
      Node nextNode = currentNode.next;
      if (nextNode == null) {
        break;
      }
      currentNode = nextNode;
    }
    currentNode.next = node;
    return currentNode;
  }

  public boolean isLast() {
    if (this.next == null) {
      return true;
    }
    return false;
  }

  public void removeNext() {
    Node newNext = next.next;
    this.next = newNext;
  }

  public void after(Node node) {
    Node nextNode = next;
    this.next = node;
    node.next = nextNode;
  }

  public void show() {
    Node currentNode = this;
    while (true) {
      System.out.println(currentNode.data + "");
      Node nextNode = currentNode.next;
      if (nextNode == null) {
        break;
      }
      currentNode = nextNode;
    }
  }

}
