package MutiThread;

public class ThreadStop implements Runnable {

  private boolean flag = true;

  @Override
  public void run() {
    int i = 0;
    while (flag) {
      System.out.println("running thread" + i++);

    }
  }

  public void stopT() {
    this.flag = false;
  }

  public static void main(String[] args) {
    ThreadStop thread1 = new ThreadStop();
    new Thread(thread1).start();
    for (int i = 0; i < 1000; i++) {
      System.out.println("main---->" + i);
      if (i == 900) {
        thread1.stopT();
        System.out.println("�߳�ֹͣ");
      }
    }
  }
}
