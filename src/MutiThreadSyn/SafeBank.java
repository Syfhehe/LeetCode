package MutiThreadSyn;

public class SafeBank {

  public static void main(String[] args) {
    Account account = new Account(1000, "Ǯ");
    
    DrawingThread you = new DrawingThread(account, 50, "��");
    DrawingThread wife = new DrawingThread(account, 100, "����");
    
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
  int nowMoney;// �����Ǯ

  public DrawingThread(Account account, int drawingMoney, String name) {
    super(name);
    this.account = account;
    this.drawingMoney = drawingMoney;
  }

  @Override
  public void run() {
    synchronized (account) {// ͬ�������
      if (account.money - drawingMoney < 0) {
        System.out.println(Thread.currentThread().getName() + "Ǯ������");
        return;
      }
      
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
      account.money = account.money - drawingMoney;
      System.out.println("��" + account.money);

      nowMoney = nowMoney + drawingMoney;
      System.out.println(getName() + "�����Ǯ��" + nowMoney);
    }
  }

}
