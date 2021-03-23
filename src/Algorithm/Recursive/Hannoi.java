package Algorithm.Recursive;

public class Hannoi {
  public static void main(String[] args) {
    hanoi(3, 'A', 'B', 'C');
  }
  
  //无论有多少个盘子 都认为只有最上面所有盘子和下面一个盘子

  public static void hanoi(int n, char from, char mid, char to) {
    if (n == 1) {
      System.out.println("把第1个盘子从" + from + "到" + to);
    } else {
      //上面这个移动到中间位置
      hanoi(n - 1, from, to, mid);
      //移动下面的盘子
      System.out.println("把第" + n + "个盘子从" + from + "到" + to);
      //下面这个移动到目标位置
      hanoi(n - 1, from, mid, to);
    }
  }

}
