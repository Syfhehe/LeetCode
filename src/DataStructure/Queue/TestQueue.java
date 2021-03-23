package DataStructure.Queue;

public class TestQueue {
  public static void main(String[] args) {
    MyQueue mQueue = new MyQueue();
    mQueue.add(1);
    mQueue.add(2);
    mQueue.add(3);
    mQueue.add(4);
    System.out.println(mQueue.poll());
    System.out.println(mQueue.poll());
  }
}
