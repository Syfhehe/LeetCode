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

}
