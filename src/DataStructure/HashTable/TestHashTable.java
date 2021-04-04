package DataStructure.HashTable;

public class TestHashTable {
  public static void main(String[] args) {
    Student s1 = new Student(16, 3);
    Student s2 = new Student(17, 11);
    Student s3 = new Student(18, 23);
    Student s4 = new Student(19, 24);
    Student s5 = new Student(20, 9);

    HashTable h1=new HashTable();
    h1.put(s1);
    h1.put(s2);
    h1.put(s3);
    h1.put(s4);
    h1.put(s5);
    Student tarStudent = new Student(18);
    System.out.println(h1.get(tarStudent).getCount());
    

  }
}
