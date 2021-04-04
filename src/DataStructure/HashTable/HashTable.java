package DataStructure.HashTable;

public class HashTable {

  private Student[] data = new Student[100];

  public void put(Student student) {
    data[student.hashCode()] = student;
  }

  public Student get(Student student) {
    return data[student.hashCode()];
  }

}
