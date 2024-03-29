package MutiThreadSyn;

public class SafeBuyTicket {

  public static void main(String[] args) {
    // 三个线程抢同一个资源，线程不安全
    BuyTicketSyn buyTicket = new BuyTicketSyn();
    new Thread(buyTicket, "我").start();
    new Thread(buyTicket, "黄牛").start();
    new Thread(buyTicket, "你们").start();
  }

}


class BuyTicketSyn implements Runnable {
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

  private synchronized void buy() throws InterruptedException {
    if (ticketNums <= 0) {
      flag = false;
      return;
    }
    Thread.sleep(100);
    System.out.println(Thread.currentThread().getName() + "买到" + ticketNums--);
  }

}
