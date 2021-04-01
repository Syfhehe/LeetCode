package DataStructure.Tree.BInarySortTree;

public class BinarySortTree {
  Node root;

  public void add(Node node) {
    if (root == null) {
      root = node;
    } else {
      root.add(node);
    }
  }

  public void midShow() {
    root.midShow(root);
  }

  public Node searchNode(int value) {
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
      Node targetNode = searchNode(value);

      if (targetNode == null) {
        return;
      }
      // �ҵ����ڵ�
      Node parent = searchParnet(value);
      //û���ӽڵ�
      if (targetNode.leftNode == null && targetNode.rightNode == null) {
        if (parent.leftNode.value == value) {
          parent.leftNode = null;
        } else {
          parent.rightNode = null;
        }
      } else if (targetNode.leftNode != null && targetNode.rightNode != null) { //˫�ӽڵ�

      } else { //�����ӽڵ�
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

  public Node searchParnet(int value) {
    if (root == null) {
      return null;
    } else {
      return root.searchParnet(value);
    }
  }

}
