package DataStructure.Tree;

public class ThreadedNode {
  int value;
  ThreadedNode lNode;
  ThreadedNode rNode;
  //如果leftType=0，表示指向节点的左孩子。如果leftType=1，则表示lNode为线索，指向节点的直接前驱
  int leftType;
  //如果rightType=0，表示指向节点的右孩子。如果rightType=1，则表示rNode为线索，指向节点的直接后继
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

  // 查找
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

  // 删除子树
  public void delete(int i) {
    ThreadedNode parentNode = this;
    // 左儿子
    if (parentNode.lNode != null && parentNode.lNode.value == i) {
      parentNode.lNode = null;
      return;
    }
    // 右儿子
    if (parentNode.rNode != null && parentNode.rNode.value == i) {
      parentNode.rNode = null;
      return;
    }
    // 递归检查并删除左儿子
    parentNode = lNode;
    if (parentNode != null) {
      parentNode.delete(i);
    }
    // 递归检查并删除右儿子
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
