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
    // ��ӵ�value�ȵ�ǰ�ڵ�С
    if (node.value < this.value) {
      // �����ڵ�Ϊ��
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
    // ��ѯ�Ƿ�ƽ��
    // ����ת
    if (leftNode != null && rightNode != null && leftNode.height() - rightNode.height() >= 2) {
      if (leftNode != null && leftNode.leftNode.height() < leftNode.rightNode.height()) {
        leftNode.leftRorate();
        rightRorate();
      } else {
        rightRorate();
      }
    }
    // ����ת
    if (leftNode != null && rightNode != null && leftNode.height() - rightNode.height() <= -2) {
      if (rightNode != null && rightNode.rightNode.height() < rightNode.leftNode.height()) {
        rightNode.rightRorate();
        leftRorate();
      } else {
        leftRorate();
      }
    }
  }

  // ����ת
  private void rightRorate() {
    // ����һ���½ڵ㣬ֵ���ڵ�ǰ�ڵ��ֵ
    AvlNode newNode = new AvlNode(value);
    // ���½ڵ������������Ϊ��ǰ�ڵ��������
    newNode.rightNode = rightNode;
    // ���½ڵ������������Ϊ��ǰ�ڵ���������������
    newNode.leftNode = leftNode.rightNode;
    // �ѵ�ǰ�ڵ��ֵ����Ϊ���ӽڵ��ֵ
    value = leftNode.value;
    // �ѵ�ǰ�ڵ������������Ϊ��������������
    leftNode = leftNode.leftNode;
    // �ѵ�ǰ�ڵ������������Ϊ�½ڵ�
    rightNode = newNode;
  }

  // ����ת
  private void leftRorate() {
    // ����һ���½ڵ㣬ֵ���ڵ�ǰ�ڵ��ֵ
    AvlNode newNode = new AvlNode(value);
    // ���½ڵ������������Ϊ��ǰ�ڵ��������
    newNode.leftNode = leftNode;
    // ���½ڵ������������Ϊ��ǰ�ڵ���������������
    newNode.rightNode = rightNode.leftNode;
    // �ѵ�ǰ�ڵ��ֵ����Ϊ���ӽڵ��ֵ
    value = rightNode.value;
    // �ѵ�ǰ�ڵ������������Ϊ��������������
    rightNode = rightNode.rightNode;
    // �ѵ�ǰ�ڵ������������Ϊ�½ڵ�
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
