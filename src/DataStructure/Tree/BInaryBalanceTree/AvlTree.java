package DataStructure.Tree.BInaryBalanceTree;

public class AvlTree {
  AvlNode root;

  public void add(AvlNode node) {
    if (root == null) {
      root = node;
    } else {
      root.add(node);
    }
  }

  public void midShow() {
    root.midShow(root);
  }

  public AvlNode searchNode(int value) {
    if (root == null) {
      return null;
    }
    return root.searchNode(value);
  }

  public void delete(int value) {
    if (root == null) {
      return;
    } else {
      // �ҵ����ĸ��ڵ�
      AvlNode targetNode = searchNode(value);

      if (targetNode == null) {
        return;
      }
      // �ҵ����ڵ�
      AvlNode parent = searchParnet(value);
      // û���ӽڵ�
      if (targetNode.leftNode == null && targetNode.rightNode == null) {
        if (parent.leftNode.value == value) {
          parent.leftNode = null;
        } else {
          parent.rightNode = null;
        }
      } else if (targetNode.leftNode != null && targetNode.rightNode != null) { // ˫�ӽڵ�
        int min = deleteMin(targetNode.rightNode);
        targetNode.value = min;
      } else { // �����ӽڵ�
        if (targetNode.leftNode != null) {
          if (parent.leftNode.value == value) {
            parent.leftNode = targetNode.leftNode;
          } else {
            parent.rightNode = targetNode.leftNode;
          }
        } else {
          if (parent.rightNode.value == value) {
            parent.leftNode = targetNode.rightNode;
          } else {
            parent.rightNode = targetNode.rightNode;
          }
        }
      }
    }
  }

  private int deleteMin(AvlNode node) {
    // TODO Auto-generated method stub
    AvlNode targetNode = node;
    while (targetNode.leftNode != null) {
      targetNode = targetNode.leftNode;
    }
    delete(targetNode.value);
    return targetNode.value;
  }

  public AvlNode searchParnet(int value) {
    if (root == null) {
      return null;
    } else {
      return root.searchParnet(value);
    }
  }

}
