package MutiThread;

public class TestThread2 implements Runnable {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("���ڿ�����");
    }
  }

  public static void main(String[] args) {
    TestThread2 test1 = new TestThread2();
    new Thread(test1).start();
    for (int i = 0; i < 1000; i++) {
      System.out.println("��ѧϰ���߳�--" + i);
    }
  }
}
