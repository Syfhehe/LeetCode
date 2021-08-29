package DeleteFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test3 {

  public static void main(String[] args) throws IOException {
    // 指定目录
    File dir = new File("E:\\BaiduNetdiskDownload\\012\\501-676");
    // 放筛选后文件的目标目录
    File des = new File("E:\\BaiduNetdiskDownload\\012\\501-676");
    findFile(dir, des);// 把java文件从dir复制到des路径下
  }

//查找指定目录中(包括子目录中)，所有的.java文件，
  public static void findFile(File f, File des) throws IOException {
    if (f.isFile()) {// 判断输入路径是不是文件
      if (f.getName().endsWith(".jpg")) {// 如果已经是java文件
        copyFile(f, des);// 把文件f复制到des
        return;
      }
    }
    // 获取目录的下的所有File对象（包括文件和文件夹）
    File[] files = f.listFiles();
    // 判断，如果是file对象不是一个目录而是一个空目录
    if (files.length == 0) {
      return;
    }
    // 程序执行到这里，那么一定是一个目录，且不是空目录
    for (int i = 0; i < files.length; i++) {
      // 遍历获取的file数组
      // 如果这个file对象仍然是一个目录，递归查找
      if (files[i].isDirectory() == true) {
        findFile(files[i], des);
      } else {
        // file对象是文件，判断是不是java文件
        if (files[i].getName().endsWith(".jpg")) {
          copyFile(files[i], des);// 直接复制文件到指定路径
        }
      }
    }
  }

//把文件f复制到des,
  public static void copyFile(File f, File des) throws IOException {
    // 创建输入字节流对象,传参是要读入内存的文件路径（"D:\\1.java"）
    FileInputStream in = new FileInputStream(f.getAbsoluteFile());
    // des是目录（"E:\\restore"），建一个新的File对象，
    // 内容：des的路径拼接要复制的文件名,结果（"E:\\restore\\1.java"）
    File file = new File(des.getAbsoluteFile(), f.getName());

    // 创建字节输出流对象,传参是内存数据要写入的文件路径
    FileOutputStream out = new FileOutputStream(file);
    // 用多个字符获取文件
    byte[] bytes = new byte[1024];
    int len;
    while ((len = in.read(bytes)) != -1) {// 1、先把文件副本读入内存
      out.write(bytes, 0, len);// 2、再把文件副本写到外存的新位置
    }
    in.close();// 关闭资源
    out.close();
  }



}
