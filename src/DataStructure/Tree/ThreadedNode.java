package DataStructure.Tree;

public class ThreadedNode {
  int value;
  ThreadedNode lNode;
  ThreadedNode rNode;
  //���leftType=0����ʾָ��ڵ�����ӡ����leftType=1�����ʾlNodeΪ������ָ��ڵ��ֱ��ǰ��
  int leftType;
  //���rightType=0����ʾָ��ڵ���Һ��ӡ����rightType=1�����ʾrNodeΪ������ָ��ڵ��ֱ�Ӻ��
  int rightType;

  public ThreadedNode(int value) {
    this.value = value;
  }

  public void setlNode(ThreadedNode lNode) {
    this.lNode = lNode;
  }

  public void setrNode(ThreadedNode rNode) {
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
  public ThreadedNode frontSearch(int val) {
    ThreadedNode target = null;
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
    ThreadedNode parentNode = this;
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

  public int getLeftType() {
    return leftType;
  }

  public void setLeftType(int leftType) {
    this.leftType = leftType;
  }

  public int getRightType() {
    return rightType;
  }

  public void setRightType(int rightType) {
    this.rightType = rightType;
  }

}
