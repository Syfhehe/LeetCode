package DataStructure.Tree;

public class ThreadedBinaryTreeTest {
  public static void main(String[] args) {

    ThreadedBinaryTree binaryTree = new ThreadedBinaryTree();
    ThreadedNode root = new ThreadedNode(1);
    binaryTree.setRoot(root);
    ThreadedNode left = new ThreadedNode(2);
    ThreadedNode right = new ThreadedNode(3);
    root.setlNode(left);
    root.setrNode(right);
    ThreadedNode left1 = new ThreadedNode(4);
    ThreadedNode right1 = new ThreadedNode(5);
    ThreadedNode left2 = new ThreadedNode(6);
    ThreadedNode right2 = new ThreadedNode(7);
    left.setlNode(left1);
    left.setrNode(right1);
    right.setlNode(left2);
    right.setrNode(right2);
    binaryTree.mid();
    binaryTree.threadedNodes();
    System.out.println("-------------------------");
    System.out.println(right1.rNode.value);
    System.out.println("-------------------------");
    binaryTree.threadedIterator();
  }
}
