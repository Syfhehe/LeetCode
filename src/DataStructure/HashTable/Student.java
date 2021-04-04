package DataStructure.HashTable;

public class Student {
  public Student(int age) {
    super();
    this.age = age;
  }

  public Student(int age, int count) {
    super();
    this.age = age;
    this.count = count;
  }

  private int age;
  private int count;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int hashCode() {
    return age;
  }
  
}
