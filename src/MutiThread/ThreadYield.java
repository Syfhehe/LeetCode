package MutiThread;

public class ThreadYield implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + "¿Ò»√«∞");
    Thread.yield();
    System.out.println(Thread.currentThread().getName() + "¿Ò»√∫Û");
  }

  public static void main(String[] args) {
    ThreadYield yield1 = new ThreadYield();
    ThreadYield yield2 = new ThreadYield();
    new Thread(yield1, "yield1").start();
    new Thread(yield2, "yield2").start();
  }
}
