package MutiThread;

public class TestThread1 extends Thread {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("我在看代码");
    }
  }

  public static void main(String[] args) {
    TestThread1 test1 = new TestThread1();
    test1.start();
    for (int i = 0; i < 1000; i++) {
      System.out.println("我学习多线程--" + i);
    }
  }
}
