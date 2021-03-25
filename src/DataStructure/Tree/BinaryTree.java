package DataStructure.Tree;


public class BinaryTree {
  TreeNode root;

  public TreeNode getRoot() {
    return root;
  }

  public void setRoot(TreeNode root) {
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

  public TreeNode frontSearch(int val) {
    return root.frontSearch(val);
  }

  public void delete(int i) {
    if (root.value == i) {
      root = null;
    } else {
      root.delete(i);
    }
  }


}
