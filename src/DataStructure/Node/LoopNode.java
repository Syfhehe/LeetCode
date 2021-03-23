package DataStructure.Node;

public class LoopNode {
  int data;
  LoopNode next = this;

  public LoopNode(int data) {
    this.data = data;
  }

  public LoopNode next() {
    return this.next;
  }

  public void after(LoopNode node) {
    LoopNode nextNode = next;
    this.next = node;
    node.next = nextNode;
  }

}
