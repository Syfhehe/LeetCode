package Algorithm.Recursive;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fibo(1));
    System.out.println(fibo(2));
    System.out.println(fibo(3));
    System.out.println(fibo(8));

  }

  public static int fibo(int i) {
    if (i == 1 || i == 2) {
      return 1;
    } else {
      return fibo(i - 1) + fibo(i - 2);
    }
  }

}
