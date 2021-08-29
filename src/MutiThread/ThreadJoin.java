package MutiThread;

public class ThreadJoin implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("线程VIP来了");
    }
  }

  public static void main(String[] args) {
    ThreadJoin join = new ThreadJoin();
    Thread thread = new Thread(join, "join");
    thread.start();

    for (int i = 0; i < 1000; i++) {
      if (i == 200) {
        try {
          thread.join();
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      System.out.println("Main线程VIP");

    }
  }
}
