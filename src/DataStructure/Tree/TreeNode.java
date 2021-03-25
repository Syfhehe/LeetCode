package DataStructure.Tree;

public class TreeNode {
  int value;
  TreeNode lNode;
  TreeNode rNode;

  public TreeNode(int value) {
    this.value = value;
  }

  public void setlNode(TreeNode lNode) {
    this.lNode = lNode;
  }

  public void setrNode(TreeNode rNode) {
    this.rNode = rNode;
  }

  public void front() {
    System.out.println(this.value);

    if (lNode != null) {
      lNode.front();
    }
    if (rNode != null) {
      rNode.front();
    }
  }

  public void mid() {
    if (lNode != null) {
      lNode.mid();
    }

    System.out.println(this.value);

    if (rNode != null) {
      rNode.mid();
    }
  }

  public void after() {
    if (lNode != null) {
      lNode.after();
    }
    if (rNode != null) {
      rNode.after();
    }

    System.out.println(this.value);
  }

  // ����
  public TreeNode frontSearch(int val) {
    TreeNode target = null;
    if (this.value == val) {
      return this;
    } else {
      if (lNode != null) {
        target = lNode.frontSearch(val);
      }
      if (target != null) {
        return target;
      }
      if (rNode != null) {
        target = rNode.frontSearch(val);
      }
      if (target != null) {
        return target;
      }
    }
    return target;
  }

  // ɾ������
  public void delete(int i) {
    TreeNode parentNode = this;
    // �����
    if (parentNode.lNode != null && parentNode.lNode.value == i) {
      parentNode.lNode = null;
      return;
    }
    // �Ҷ���
    if (parentNode.rNode != null && parentNode.rNode.value == i) {
      parentNode.rNode = null;
      return;
    }
    // �ݹ��鲢ɾ�������
    parentNode = lNode;
    if (parentNode != null) {
      parentNode.delete(i);
    }
    // �ݹ��鲢ɾ���Ҷ���
    parentNode = rNode;
    if (parentNode != null) {
      parentNode.delete(i);
    }

  }

}
