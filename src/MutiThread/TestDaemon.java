package MutiThread;

public class TestDaemon {
  public static void main(String[] args) {
    God god = new God();
    You you = new You();
    Thread thread1 = new Thread(god);
    thread1.setDaemon(true);//守护线程
    thread1.start();
    Thread thread2 = new Thread(you);
    thread2.start();
  }
}


class You implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 36500; i++) {
      System.out.println("开心的活着。");
    }
    System.out.println("-----------goodbye world--------------------");
  }
}


class God implements Runnable {
  @Override
  public void run() {
    while (true) {
      System.out.println("上帝保佑你");
    }
  }
}
