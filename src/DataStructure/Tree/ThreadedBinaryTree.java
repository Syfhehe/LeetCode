package DataStructure.Tree;


public class ThreadedBinaryTree {
  ThreadedNode root;
  // ��ʱ�洢ǰ���ڵ�
  ThreadedNode preNode;
  // ��ʱ�洢��̽ڵ�
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

  // ��������������
  public void threadedNodes() {
    threadedNodes(root);
  }

  public void threadedNodes(ThreadedNode node) {
    if (node == null) {
      return;
    }
    // ����������
    threadedNodes(node.lNode);

    // ����ǰ���ڵ�
    if (node.lNode == null) {
      // �õ�ǰ�ڵ����ָ��ָ��ǰ���ڵ�
      node.lNode = preNode;
      node.leftType = 1;
    }
    // ����ǰ���ڵ����ָ�룬���ǰ���ڵ����ָ����null û��ָ��������
    if (preNode != null && preNode.rNode == null) {
      // ��ǰ������������ָ��ָ��ǰ�ڵ�
      preNode.rNode = node;
      preNode.rightType = 1;
    }
    preNode = node;

    // ����������
    threadedNodes(node.rNode);

  }

  // ��������������
  public void threadedIterator() {
    ThreadedNode node = root;
    while (node != null) {
      while (node.leftType == 0) {
        node = node.lNode;
      }
      System.out.println(node.value);
      // �����ǰ�ڵ����ָ��ָ����Ǻ�̽ڵ㣬�п��ܺ�̽ڵ㻹�к�̽ڵ㣬��Ҫѭ����
      while (node.rightType == 1) {
        node = node.rNode;
        System.out.println(node.value);
      }
      node = node.rNode;
    }
  }

}
