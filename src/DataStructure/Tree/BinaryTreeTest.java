package DataStructure.Tree;

public class BinaryTreeTest {
  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree();
    TreeNode root = new TreeNode(1);
    binaryTree.setRoot(root);
    TreeNode left = new TreeNode(2);
    TreeNode right = new TreeNode(3);
    root.setlNode(left);
    root.setrNode(right);
    TreeNode left1 = new TreeNode(4);
    TreeNode right1 = new TreeNode(5);
    TreeNode left2 = new TreeNode(6);
    TreeNode right2 = new TreeNode(7);
    left.setlNode(left1);
    left.setrNode(right1);
    right.setlNode(left2);
    right.setrNode(right2);

    binaryTree.front();
    System.out.println("------------------");
    binaryTree.mid();
    System.out.println("------------------");
    binaryTree.after();
    System.out.println("------------------");

    TreeNode resultNode = binaryTree.frontSearch(3);
    System.out.println(resultNode == right);
    
    System.out.println("------------------");
    binaryTree.front();
    System.out.println("------------------");
    binaryTree.delete(3);
    binaryTree.front();


  }
}
