package DataStructure.Tree.HuffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HuffmanCodeTest {
  public static void main(String[] args) {
    String msgString = "can you can a can as a can canner can a can.";
    byte[] bytes = msgString.getBytes();
    //����
    byte[] encodedBytes = huffmanZip(bytes);
    System.out.println(bytes.length);
    System.out.println(encodedBytes.length);
    //����
    byte[] decodedBytes = decodeHuffman(bytes);
    
  }

  private static byte[] decodeHuffman(byte[] bytes) {
    // TODO Auto-generated method stub
    return null;
  }

  public static byte[] huffmanZip(byte[] bytes) {
    // ��ͳ��ÿһ��byte���ֵĴ�����������һ��������
    List<Node> nodes = getNodes(bytes);
    // ����һ���շ�����
    Node tree = createHuffmanTree(nodes);
    System.out.println(tree);
    // ����һ���շ��������
    Map<Byte, String> codes = getCodes(tree);
    System.out.println(codes);
    // ����
    byte[] byteCodes = zip(bytes, huffCodes);

    return byteCodes;
  }

  private static byte[] zip(byte[] bytes, Map<Byte, String> huffCodes) {
    StringBuilder sbBuilder = new StringBuilder();
    // ����Ҫѹ����byte���鴦���һ���������ַ���
    for (byte b : bytes) {
      sbBuilder.append(huffCodes.get(b));
    }
    System.out.println(sbBuilder.toString());
    int length = 0;
    if (sbBuilder.length() % 8 == 0) {
      length = sbBuilder.length() / 8;
    } else {
      length = sbBuilder.length() / 8 + 1;
    }
    byte[] by = new byte[length];
    int index = 0;
    for (int i = 0; i < by.length; i++) {
      String byteString;
      if (i + 8 > sbBuilder.length()) {
        byteString = sbBuilder.substring(i);
      } else {
        byteString = sbBuilder.substring(i, i + 8);
      }
      by[index]=(byte) Integer.parseInt(byteString,2);index++;
    }
    return by;
  }

  static StringBuilder sb = new StringBuilder();
  static Map<Byte, String> huffCodes = new HashMap<Byte, String>();

  //����huffman����ȡHuffman����
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
    //�ϴν���ŵ����
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
    System.out.println(counts);
    for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
      nodes.add(new Node(entry.getKey(), entry.getValue()));
    }
    return nodes;
  }
}
