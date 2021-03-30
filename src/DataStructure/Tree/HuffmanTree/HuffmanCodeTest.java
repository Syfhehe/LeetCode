package DataStructure.Tree.HuffmanTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class HuffmanCodeTest {

  static StringBuilder sb = new StringBuilder();
  static Map<Byte, String> huffCodes = new HashMap<Byte, String>();

  public static void main(String[] args) throws IOException {
//    String msgString = "can you can a can as a can canner can a can.";
//    byte[] bytes = msgString.getBytes();
//    // ����
//    byte[] encodedBytes = huffmanZip(bytes);
//    // ����
//    byte[] decodedBytes = decodeHuffman(huffCodes, encodedBytes);
//    System.out.println(new String(decodedBytes));
    String src = "1.jpg";
    String dst = "2.zip";
    zipFile(src, dst);
  }

  public static void zipFile(String src, String dst) throws IOException {
    InputStream iStream = new FileInputStream(src);
    byte[] b = new byte[iStream.available()];
    iStream.read(b);
    iStream.close();
    byte[] zipBytes = huffmanZip(b);
    OutputStream os = new FileOutputStream(dst);
    ObjectOutputStream oos = new ObjectOutputStream(os);
    oos.writeObject(zipBytes);
    oos.writeObject(huffCodes);
    oos.close();
    os.close();
  }

  private static byte[] decodeHuffman(Map<Byte, String> huffmanCodes, byte[] bytes) {
    // ��byte����ת���ɶ����Ƶ��ַ���
    StringBuilder sBuilder = new StringBuilder();
    for (int i = 0; i < bytes.length; i++) {
      Byte b = bytes[i];
      Boolean flag = false;
      if (i == bytes.length - 1) {
        flag = true;
      }
      sBuilder.append(byteToBitString(b, flag));
    }
    System.out.println(sBuilder.toString());
    // ����һ���������ڴ�byte
    List<Byte> list = new ArrayList<Byte>();
    // ���ַ������պշ���������н���
    Map<String, Byte> map = new HashMap<String, Byte>();
    for (Entry<Byte, String> entry : huffmanCodes.entrySet()) {
      map.put(entry.getValue(), entry.getKey());
    }
    for (int i = 0; i < sBuilder.length();) {
      int count = 1;
      boolean flag = true;
      Byte b = null;
      while (flag) {
        String string = sBuilder.substring(i, i + count);
        b = map.get(string);
        if (b == null) {
          count++;
        } else {
          flag = false;
        }
      }
      list.add(b);
      System.out.println(b);
      i += count;

    }
    byte[] decodedBytes = new byte[list.size()];
    for (int i = 0; i < list.size(); i++) {
      decodedBytes[i] = list.get(i);
    }
    return decodedBytes;
  }

  private static String byteToBitString(byte b, Boolean flag) {
    int temp = b;
    if (!flag) {
      temp |= 256;
    }
    String str = Integer.toBinaryString(temp);
    if (!flag) {
      return str.substring(str.length() - 8);
    } else {
      return str;
    }
  }



  public static byte[] huffmanZip(byte[] bytes) {
    // ��ͳ��ÿһ��byte���ֵĴ�����������һ��������
    List<Node> nodes = getNodes(bytes);
    // ����һ���շ�����
    Node tree = createHuffmanTree(nodes);
    // ����һ���շ��������
    getCodes(tree);
    // ����
    byte[] byteCodes = zip(bytes, huffCodes);

    return byteCodes;
  }

  private static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
    StringBuilder sb = new StringBuilder();
    // ����Ҫѹ����byte���鴦���һ���������ַ���
    for (byte b : bytes) {
      sb.append(huffCodes.get(b));
    }
    System.out.println(sb.toString());
    int length = 0;
    if (sb.length() % 8 == 0) {
      length = sb.length() / 8;
    } else {
      length = sb.length() / 8 + 1;
    }
    byte[] by = new byte[length];
    int index = 0;
    for (int i = 0; i < sb.length(); i += 8) {
      String byteString;
      if (i + 8 > sb.length()) {
        byteString = sb.substring(i);
      } else {
        byteString = sb.substring(i, i + 8);
      }
      by[index] = (byte) Integer.parseInt(byteString, 2);
      // System.out.println(byteString + ":" + by[index]);
      index++;
    }
    return by;
  }

  // ����huffman����ȡHuffman����
  private static Map<Byte, String> getCodes(Node tree) {
    if (tree == null) {
      return null;
    }
    // �ݹ�
    getCodes(tree.leftNode, "0", sb);
    getCodes(tree.rightNode, "1", sb);
    return huffCodes;
  }

  private static void getCodes(Node node, String code, StringBuilder sb) {
    StringBuilder sb2 = new StringBuilder(sb);
    // �ϴν���ŵ����
    sb2.append(code);
    if (node.data == null) {
      getCodes(node.leftNode, "0", sb2);
      getCodes(node.rightNode, "1", sb2);
    } else {
      huffCodes.put(node.data, sb2.toString());
    }

  }

  private static Node createHuffmanTree(List<Node> nodes) {
    while (nodes.size() > 1) {
      Collections.sort(nodes);
      Node leftNode = nodes.get(nodes.size() - 1);
      Node rightNode = nodes.get(nodes.size() - 2);
      Node parant = new Node(null, leftNode.weight + rightNode.weight);
      parant.leftNode = leftNode;
      parant.rightNode = rightNode;
      nodes.remove(leftNode);
      nodes.remove(rightNode);
      nodes.add(parant);
    }
    return nodes.get(0);
  }

  private static List<Node> getNodes(byte[] bytes) {
    List<Node> nodes = new ArrayList<Node>();
    Map<Byte, Integer> counts = new HashMap<>();
    for (int i = 0; i < bytes.length; i++) {
      byte b = bytes[i];
      Integer count = counts.get(b);
      if (count == null) {
        counts.put(b, 1);
      } else {
        counts.put(b, count + 1);
      }
    }
    for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
      nodes.add(new Node(entry.getKey(), entry.getValue()));
    }
    return nodes;
  }
}
