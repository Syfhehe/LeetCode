package MutiThread;

public class Lamda {
  // ��̬�ڲ���
  static class Like2 implements ILike {
    @Override
    public void lamda() {
      System.out.println("I like lamda2.");
    }
  }

  public static void main(String[] args) {
    ILike like = new Like();
    like.lamda();
    like = new Like2();
    like.lamda();
    // �ֲ��ڲ���
    class Like3 implements ILike {
      @Override
      public void lamda() {
        System.out.println("I like lamda3.");
      }
    }
    like = new Like3();
    like.lamda();
    like = new ILike() {// �����ڲ��࣬��������ӿڻ��߸���
      @Override
      public void lamda() {
        System.out.println("I like lamda4.");
      }
    };
    like.lamda();
    like = () -> {// lamda���ʽ�������Ǻ���ʽ�ӿڣ��ӿ�ֻ��һ���񽱷���
      System.out.println("I like lamda5.");
    };
    like.lamda();
  }
}

interface ILike {
  void lamda();
}

class Like implements ILike {
  @Override
  public void lamda() {
    System.out.println("I like lamda.");
  }
}
