package DataStructure.Graph;

import DataStructure.Stack.Mystack;

public class Graph {
  private Vertex[] vertexs;
  private int currentSize;
  public int[][] adjMat;
  public Mystack stack = new Mystack();
  private int currentIndex;

  public Graph(int size) {
    vertexs = new Vertex[size];
    adjMat = new int[size][size];
    for (int i = 0; i < adjMat.length; i++) {
      adjMat[i][i] = 1;
    }
  }

  public void addVertex(Vertex v) {
    vertexs[currentSize++] = v;
  }

  // ��Ӿ���
  public void addEdge(String v1, String v2) {
    int index1 = 0;
    for (int i = 0; i < vertexs.length; i++) {
      if (vertexs[i].getValue().equals(v1)) {
        index1 = i;
        break;
      }
    }
    int index2 = 0;
    for (int i = 0; i < vertexs.length; i++) {
      if (vertexs[i].getValue().equals(v2)) {
        index2 = i;
        break;
      }
    }
    adjMat[index1][index2] = 1;
    adjMat[index2][index1] = 1;

  }

  // ��������㷨
  public void dfs() {
    vertexs[0].setVisited(true);
    stack.push(0);
    System.out.println(vertexs[0].getValue());
    out: while (!stack.isEmpty()) {
      for (int i = currentIndex + 1; i < vertexs.length; i++) {
        if (adjMat[currentIndex][i] == 1 && vertexs[i].isVisited() == false) {
          stack.push(i);
          vertexs[i].setVisited(true);
          System.out.println(vertexs[i].getValue());
          continue out;
        }
      }
      // ����ջ��Ԫ��
      stack.pop();
      if (!stack.isEmpty()) {
        currentIndex = stack.peak();
      }
    }
  }

  // ��������㷨
  private void wfs() {

  }


}
