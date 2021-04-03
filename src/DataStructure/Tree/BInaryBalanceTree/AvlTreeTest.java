package DataStructure.Tree.BInaryBalanceTree;

public class AvlTreeTest {
  public static void main(String[] args) {

    //int[] arr = {8,9,6,7,5,4};
//    int[] arr = {2,1,4,3,5,6};
    int[] arr = {8,9,5,4,6,7};

    AvlTree tree = new AvlTree();

    for (int i = 0; i < arr.length; i++) {
      tree.add(new AvlNode(arr[i]));
    }

    tree.midShow();
    System.out.println("----------------------");
    System.out.println(tree.root.height());
    System.out.println(tree.root.value);

  }
}
