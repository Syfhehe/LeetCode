package MutiThreadSyn;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
  public static void main(String[] args) {
    Makeup girl1 = new Makeup(1, "美女1");
    Makeup girl2 = new Makeup(0, "美女2");
    girl1.start();
    girl2.start();
    ReentrantLock a = new  ReentrantLock();
  }
}


class Lipstick {

}


class Mirror {

}


class Makeup extends Thread {

  static Lipstick lipstick = new Lipstick();
  static Mirror mirror = new Mirror();
  int choice;
  String girlName;

  public Makeup(int choice, String girlName) {
    super();
    this.choice = choice;
    this.girlName = girlName;
  }

  @Override
  public void run() {
    makeup();
  }

  private void makeup() {
    if (choice == 0) {
      synchronized (lipstick) {// 获得口红的锁
        System.out.println(this.girlName + "获得口红的锁");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        synchronized (mirror) {// 获得镜子的锁
          System.out.println(this.girlName + "获得镜子的锁");
        }
      }
    } else {
      synchronized (mirror) {// 获得镜子的锁
        System.out.println(this.girlName + "获得镜子的锁");
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        synchronized (lipstick) {// 获得口红的锁
          System.out.println(this.girlName + "获得口红的锁");
        }
      }
    }

  }
}
