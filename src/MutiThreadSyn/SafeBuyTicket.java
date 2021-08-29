package MutiThreadSyn;

public class SafeBuyTicket {

  public static void main(String[] args) {
    // �����߳���ͬһ����Դ���̲߳���ȫ
    BuyTicketSyn buyTicket = new BuyTicketSyn();
    new Thread(buyTicket, "��").start();
    new Thread(buyTicket, "��ţ").start();
    new Thread(buyTicket, "����").start();
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
    System.out.println(Thread.currentThread().getName() + "��" + ticketNums--);
  }

}
