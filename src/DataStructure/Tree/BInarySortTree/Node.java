package DataStructure.Tree.BInarySortTree;

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

  public void add(Node node) {
    if (node == null) {
      return;
    }
    // 添加的value比当前节点小
    if (node.value < this.value) {
      // 如果左节点为空
      if (leftNode == null) {
        this.leftNode = node;
      } else {
        this.leftNode.add(node);
      }
    } else {
      if (rightNode == null) {
        this.rightNode = node;
      } else {
        this.rightNode.add(node);
      }
    }
  }

  public void midShow(Node node) {

    if (node.leftNode != null) {
      node.leftNode.midShow(node.leftNode);
    }
    System.out.println(node.value);

    if (node.rightNode != null) {
      node.rightNode.midShow(node.rightNode);
    }

  }

  public Node searchNode(int value) {
    if (this.value == value) {
      return this;
    }
    if (this.value < value) {
      if (rightNode == null) {
        return null;
      }
      return rightNode.searchNode(value);
    } else {
      if (leftNode == null) {
        return null;
      }
      return leftNode.searchNode(value);
    }
  }

  public Node searchParnet(int value) {
    // TODO Auto-generated method stub
    if (this.leftNode != null && this.leftNode.value == value
        || (this.rightNode != null && this.rightNode.value == value)) {
      return this;
    } else {
      if (this.leftNode != null && this.value > value) {
        return this.leftNode.searchParnet(value);
      } else if (this.rightNode != null && this.value < value) {
        return this.rightNode.searchParnet(value);
      }
    }
    return null;
  }


}
