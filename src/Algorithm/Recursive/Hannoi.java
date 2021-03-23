package Algorithm.Recursive;

public class Hannoi {
  public static void main(String[] args) {
    hanoi(3, 'A', 'B', 'C');
  }
  
  //�����ж��ٸ����� ����Ϊֻ���������������Ӻ�����һ������

  public static void hanoi(int n, char from, char mid, char to) {
    if (n == 1) {
      System.out.println("�ѵ�1�����Ӵ�" + from + "��" + to);
    } else {
      //��������ƶ����м�λ��
      hanoi(n - 1, from, to, mid);
      //�ƶ����������
      System.out.println("�ѵ�" + n + "�����Ӵ�" + from + "��" + to);
      //��������ƶ���Ŀ��λ��
      hanoi(n - 1, from, mid, to);
    }
  }

}
