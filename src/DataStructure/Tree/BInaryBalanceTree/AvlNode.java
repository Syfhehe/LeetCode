package DataStructure.Tree.BInaryBalanceTree;

public class AvlNode implements Comparable<AvlNode> {
  int value;
  AvlNode leftNode;
  AvlNode rightNode;

  public AvlNode(int value) {
    this.value = value;
  }

  @Override
  public int compareTo(AvlNode o) {
    // TODO Auto-generated method stub
    return o.value - this.value;
  }

  @Override
  public String toString() {
    return "Node [value=" + value + "]";
  }

  public void add(AvlNode node) {
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
    // 查询是否平衡
    // 右旋转
    if (leftNode != null && rightNode != null && leftNode.height() - rightNode.height() >= 2) {
      if (leftNode != null && leftNode.leftNode.height() < leftNode.rightNode.height()) {
        leftNode.leftRorate();
        rightRorate();
      } else {
        rightRorate();
      }
    }
    // 左旋转
    if (leftNode != null && rightNode != null && leftNode.height() - rightNode.height() <= -2) {
      if (rightNode != null && rightNode.rightNode.height() < rightNode.leftNode.height()) {
        rightNode.rightRorate();
        leftRorate();
      } else {
        leftRorate();
      }
    }
  }

  // 右旋转
  private void rightRorate() {
    // 创建一个新节点，值等于当前节点的值
    AvlNode newNode = new AvlNode(value);
    // 把新节点的右子树设置为当前节点的右子树
    newNode.rightNode = rightNode;
    // 把新节点的左子树设置为当前节点左子树的右子树
    newNode.leftNode = leftNode.rightNode;
    // 把当前节点的值设置为左子节点的值
    value = leftNode.value;
    // 把当前节点的左子树设置为左子树的左子树
    leftNode = leftNode.leftNode;
    // 把当前节点的右子树设置为新节点
    rightNode = newNode;
  }

  // 左旋转
  private void leftRorate() {
    // 创建一个新节点，值等于当前节点的值
    AvlNode newNode = new AvlNode(value);
    // 把新节点的左子树设置为当前节点的左子树
    newNode.leftNode = leftNode;
    // 把新节点的右子树设置为当前节点右子树的左子树
    newNode.rightNode = rightNode.leftNode;
    // 把当前节点的值设置为右子节点的值
    value = rightNode.value;
    // 把当前节点的右子树设置为右子树的右子树
    rightNode = rightNode.rightNode;
    // 把当前节点的左子树设置为新节点
    leftNode = newNode;
  }

  public void midShow(AvlNode node) {

    if (node.leftNode != null) {
      node.leftNode.midShow(node.leftNode);
    }
    System.out.println(node.value);

    if (node.rightNode != null) {
      node.rightNode.midShow(node.rightNode);
    }

  }

  public AvlNode searchNode(int value) {
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

  public AvlNode searchParnet(int value) {
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

  public int height() {

    return Math.max(leftNode == null ? 0 : leftNode.height(),
        rightNode == null ? 0 : rightNode.height()) + 1;
  }


}
