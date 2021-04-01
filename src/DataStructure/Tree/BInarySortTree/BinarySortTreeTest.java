package DataStructure.Tree.BInarySortTree;

public class BinarySortTreeTest {
  public static void main(String[] args) {
    
    int[] arr = {7, 3, 10, 12, 5, 1, 9};
    
    BinarySortTree tree = new BinarySortTree();

    for (int i = 0; i < arr.length; i++) {
      tree.add(new Node(arr[i]));
    }
    
    tree.midShow();
    System.out.println(tree.searchNode(10));
    System.out.println(tree.searchNode(120));

    System.out.println(tree.searchParnet(1));
    
    tree.delete(12);
    tree.midShow();
    tree.delete(10);
    tree.midShow();

  }
}
