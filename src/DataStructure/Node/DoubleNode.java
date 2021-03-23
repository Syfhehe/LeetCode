package DataStructure.Node;

public class DoubleNode {
  DoubleNode pre = this;
  DoubleNode next = this;
  int data;

  public DoubleNode(int data) {
    // TODO Auto-generated constructor stub
    this.data = data;
  }

  public void after(DoubleNode node) {
    DoubleNode nextNode = next;
    this.next = node;
    node.pre = this;
    node.next = nextNode;
    nextNode.pre = node;
  }
  
}
