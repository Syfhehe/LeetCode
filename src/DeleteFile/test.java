package DeleteFile;

import java.io.File;

public class test {

  static int flag = 1;// �����ж��ļ��Ƿ�ɾ���ɹ�

  public static void main(String[] args) {
    // ɾ��һ���ļ����µ������ļ�(������Ŀ¼�ڵ��ļ�)
    File file = new File("E:\\Ѹ������\\");// ����Ҫɾ���ļ�Ŀ¼�ľ���·��
    deleteFile(file);
    if (flag == 1) {
      System.out.println("�ļ�ɾ���ɹ���");
    }
  }

  public static void deleteFile(File file) {
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
        deleteFile(f);
      } else {
        if (!name.endsWith(".mp4")) {
          f.delete();
        }
      }
    }
    // ɾ�����ļ��� forѭ���Ѿ�����һ��ڵ��Ŀ¼��ա�
    file.delete();
  }
}
