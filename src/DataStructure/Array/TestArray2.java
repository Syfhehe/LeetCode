package DataStructure.Array;


public class TestArray2 {
  public static void main(String[] args) {
    MyArray array = new MyArray();
    array.add(1);
    array.show();
    
    array.add(2);
    array.add(3);
    array.add(4);
    
    array.delete(2);
    array.show();
    
    array.insert(2,3);
    array.show();
  }
}
