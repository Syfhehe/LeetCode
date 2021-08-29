package MutiThreadSyn;

public class UnsafeBuyTicket {

  public static void main(String[] args) {
    //三个线程抢同一个资源，线程不安全
    BuyTicket buyTicket = new BuyTicket();
    new Thread(buyTicket, "我").start();
    new Thread(buyTicket, "黄牛").start();
    new Thread(buyTicket, "你们").start();
  }

}


class BuyTicket implements Runnable {
  private int ticketNums = 10;
  boolean flag = true;

  @Override
  public void run() {

    while (flag) {
      try {
        buy();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private void buy() throws InterruptedException {
    if (ticketNums <= 0) {
      flag = false;
      return;
    }
    Thread.sleep(100);
    System.out.println(Thread.currentThread().getName() + "买到" + ticketNums--);
  }
  
}
