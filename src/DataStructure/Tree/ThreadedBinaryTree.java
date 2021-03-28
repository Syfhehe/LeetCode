package DataStructure.Tree;


public class ThreadedBinaryTree {
  ThreadedNode root;
  // 临时存储前驱节点
  ThreadedNode preNode;
  // 临时存储后继节点
  ThreadedNode nextNode;

  public ThreadedNode getRoot() {
    return root;
  }

  public void setRoot(ThreadedNode root) {
    this.root = root;
  }

  public void front() {
    if (root != null) {
      root.front();
    }
  }

  public void mid() {
    if (root != null) {
      root.mid();
    }
  }

  public void after() {
    if (root != null) {
      root.after();
    }
  }

  public ThreadedNode frontSearch(int val) {
    return root.frontSearch(val);
  }

  public void delete(int i) {
    if (root.value == i) {
      root = null;
    } else {
      root.delete(i);
    }
  }

  // 中序线索二叉树
  public void threadedNodes() {
    threadedNodes(root);
  }

  public void threadedNodes(ThreadedNode node) {
    if (node == null) {
      return;
    }
    // 处理左子树
    threadedNodes(node.lNode);

    // 处理前驱节点
    if (node.lNode == null) {
      // 让当前节点的左指针指向前驱节点
      node.lNode = preNode;
      node.leftType = 1;
    }
    // 处理前驱节点的右指针，如果前驱节点的右指针是null 没有指向右子树
    if (preNode != null && preNode.rNode == null) {
      // 让前驱及诶单的右指针指向当前节点
      preNode.rNode = node;
      preNode.rightType = 1;
    }
    preNode = node;

    // 处理右子树
    threadedNodes(node.rNode);

  }

  // 遍历线索二叉树
  public void threadedIterator() {
    ThreadedNode node = root;
    while (node != null) {
      while (node.leftType == 0) {
        node = node.lNode;
      }
      System.out.println(node.value);
      // 如果当前节点的右指针指向的是后继节点，有可能后继节点还有后继节点，需要循环找
      while (node.rightType == 1) {
        node = node.rNode;
        System.out.println(node.value);
      }
      node = node.rNode;
    }
  }

}
