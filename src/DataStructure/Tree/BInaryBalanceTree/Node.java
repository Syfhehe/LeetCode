package DataStructure.Tree.BInaryBalanceTree;

public class Node implements Comparable<Node> {
  int value;
  Node leftNode;
  Node rightNode;

  public Node(int value) {
    this.value = value;
  }

  @Override
  public int compareTo(Node o) {
    // TODO Auto-generated method stub
    return o.value - this.value;
  }

  @Override
  public String toString() {
    return "Node [value=" + value + "]";
  }


}
