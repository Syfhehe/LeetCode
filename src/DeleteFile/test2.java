package DeleteFile;

import java.io.File;

public class test2 {

  static int flag = 1;// �����ж��ļ��Ƿ�ɾ���ɹ�

  public static void main(String[] args) {
    // ɾ��һ���ļ����µ������ļ�(������Ŀ¼�ڵ��ļ�)
    File file = new File("D:\\video\\��������");// ����Ҫɾ���ļ�Ŀ¼�ľ���·��
    renameFile(file);
    if (flag == 1) {
      System.out.println("�ļ�ɾ���ɹ���");
    }
  }

  public static void renameFile(File file) {
    // �ж��ļ���Ϊnull���ļ�Ŀ¼����
    if (file == null || !file.exists()) {
      flag = 0;
      System.out.println("�ļ�ɾ��ʧ��,�����ļ�·���Ƿ���ȷ");
      return;
    }
    // ȡ�����Ŀ¼�µ��������ļ�����
    File[] files = file.listFiles();
    // ������Ŀ¼�µ��ļ�����
    String name = null;
    for (File f : files) {
      // ��ӡ�ļ���
      name = f.getName();
      System.out.println(name);
      // �ж���Ŀ¼�Ƿ������Ŀ¼,������ļ���ɾ��
      if (f.isDirectory()) {
        if (name.contains("[7sht.me]")) {
          String newName = name.replaceAll("[7sht.me]", "");
          File newFile = new File(newName);
          f.renameTo(newFile);
        }
        renameFile(f);
      }
    }
    // ɾ�����ļ��� forѭ���Ѿ�����һ��ڵ��Ŀ¼��ա�
    file.delete();
  }
}
