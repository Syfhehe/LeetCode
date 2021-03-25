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
    root.front();
  }

  public void mid() {
    root.mid();
  }

  public void after() {
    root.after();
  }

  public TreeNode frontSearch(int val) {
    return root.frontSearch(val);
  }
  
}
