package DeleteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {

  public static void main(String[] args) throws IOException {
    // ָ��Ŀ¼
    File dir = new File("E:\\BaiduNetdiskDownload\\012\\501-676");
    // ��ɸѡ���ļ���Ŀ��Ŀ¼
    File des = new File("E:\\BaiduNetdiskDownload\\012\\501-676");
    findFile(dir, des);// ��java�ļ���dir���Ƶ�des·����
  }

//����ָ��Ŀ¼��(������Ŀ¼��)�����е�.java�ļ���
  public static void findFile(File f, File des) throws IOException {
    if (f.isFile()) {// �ж�����·���ǲ����ļ�
      if (f.getName().endsWith(".jpg")) {// ����Ѿ���java�ļ�
        copyFile(f, des);// ���ļ�f���Ƶ�des
        return;
      }
    }
    // ��ȡĿ¼���µ�����File���󣨰����ļ����ļ��У�
    File[] files = f.listFiles();
    // �жϣ������file������һ��Ŀ¼����һ����Ŀ¼
    if (files.length == 0) {
      return;
    }
    // ����ִ�е������ôһ����һ��Ŀ¼���Ҳ��ǿ�Ŀ¼
    for (int i = 0; i < files.length; i++) {
      // ������ȡ��file����
      // ������file������Ȼ��һ��Ŀ¼���ݹ����
      if (files[i].isDirectory() == true) {
        findFile(files[i], des);
      } else {
        // file�������ļ����ж��ǲ���java�ļ�
        if (files[i].getName().endsWith(".jpg")) {
          copyFile(files[i], des);// ֱ�Ӹ����ļ���ָ��·��
        }
      }
    }
  }

//���ļ�f���Ƶ�des,
  public static void copyFile(File f, File des) throws IOException {
    // ���������ֽ�������,������Ҫ�����ڴ���ļ�·����"D:\\1.java"��
    FileInputStream in = new FileInputStream(f.getAbsoluteFile());
    // des��Ŀ¼��"E:\\restore"������һ���µ�File����
    // ���ݣ�des��·��ƴ��Ҫ���Ƶ��ļ���,�����"E:\\restore\\1.java"��
    File file = new File(des.getAbsoluteFile(), f.getName());

    // �����ֽ����������,�������ڴ�����Ҫд����ļ�·��
    FileOutputStream out = new FileOutputStream(file);
    // �ö���ַ���ȡ�ļ�
    byte[] bytes = new byte[1024];
    int len;
    while ((len = in.read(bytes)) != -1) {// 1���Ȱ��ļ����������ڴ�
      out.write(bytes, 0, len);// 2���ٰ��ļ�����д��������λ��
    }
    in.close();// �ر���Դ
    out.close();
  }



}
