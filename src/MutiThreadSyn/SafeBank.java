package MutiThreadSyn;

public class SafeBank {

  public static void main(String[] args) {
    Account account = new Account(1000, "钱");
    
    DrawingThread you = new DrawingThread(account, 50, "你");
    DrawingThread wife = new DrawingThread(account, 100, "老婆");
    
    you.start();
    wife.start();
  }
  
}


class Account {
  int money;
  String name;
  public Account(int money, String name) {
    super();
    this.money = money;
    this.name = name;
  }
}


class DrawingThread extends Thread {
  Account account;
  int drawingMoney;
  int nowMoney;// 手里的钱

  public DrawingThread(Account account, int drawingMoney, String name) {
    super(name);
    this.account = account;
    this.drawingMoney = drawingMoney;
  }

  @Override
  public void run() {
    synchronized (account) {// 同步代码块
      if (account.money - drawingMoney < 0) {
        System.out.println(Thread.currentThread().getName() + "钱不够了");
        return;
      }
      
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
      account.money = account.money - drawingMoney;
      System.out.println("余额：" + account.money);

      nowMoney = nowMoney + drawingMoney;
      System.out.println(getName() + "手里的钱：" + nowMoney);
    }
  }

}
