package MutiThread;

public class TestDaemon {
  public static void main(String[] args) {
    God god = new God();
    You you = new You();
    Thread thread1 = new Thread(god);
    thread1.setDaemon(true);//�ػ��߳�
    thread1.start();
    Thread thread2 = new Thread(you);
    thread2.start();
  }
}


class You implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 36500; i++) {
      System.out.println("���ĵĻ��š�");
    }
    System.out.println("-----------goodbye world--------------------");
  }
}


class God implements Runnable {
  @Override
  public void run() {
    while (true) {
      System.out.println("�ϵ۱�����");
    }
  }
}
