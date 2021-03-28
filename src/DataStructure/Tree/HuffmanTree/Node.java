package DataStructure.Tree.HuffmanTree;

public class Node implements Comparable<Node> {
  Byte data;
  int weight;
  Node leftNode;
  Node rightNode;

  public Node(Byte data, int weight) {
    this.data = data;
    this.weight = weight;
  }

  @Override
  public int compareTo(Node o) {
    // TODO Auto-generated method stub
    return o.weight - this.weight;
  }

  @Override
  public String toString() {
    return "Node [data=" + data + ", weight=" + weight + "]";
  }

}
