package MutiThread;

public class Lamda {
  // 静态内部类
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
    // 局部内部类
    class Like3 implements ILike {
      @Override
      public void lamda() {
        System.out.println("I like lamda3.");
      }
    }
    like = new Like3();
    like.lamda();
    like = new ILike() {// 匿名内部类，必须借助接口或者父类
      @Override
      public void lamda() {
        System.out.println("I like lamda4.");
      }
    };
    like.lamda();
    like = () -> {// lamda表达式，必须是函数式接口，接口只有一个像奖方法
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
