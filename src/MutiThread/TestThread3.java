package MutiThread;

public class TestThread3 implements Runnable {
  private int ticketNums = 10;

  public void run() {
    while (true) {
      if (ticketNums <= 0) {
        break;
      }
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "--->get " + ticketNums-- + "ticket");
    }
  }

  public static void main(String[] args) {
    TestThread3 testThread3 = new TestThread3();
    new Thread(testThread3, "ÎÒ").start();
    new Thread(testThread3, "Äã").start();
    new Thread(testThread3, "Ëû").start();
  }
}
