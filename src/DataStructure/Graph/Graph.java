package DataStructure.Graph;

import DataStructure.Queue.MyQueue;
import DataStructure.Stack.Mystack;

public class Graph {
  private Vertex[] vertexs;
  private int currentSize;
  public int[][] adjMat;
  public Mystack stack = new Mystack();
  public MyQueue queue = new MyQueue();

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

  // 领接矩阵
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

  // 深度优先算法
  public void DFS() {
    vertexs[0].setVisited(true);
    stack.push(0);
    System.out.println(vertexs[0].getValue());
    out: while (!stack.isEmpty()) {
      for (int i = currentIndex + 1; i < vertexs.length; i++) {
        if (adjMat[currentIndex][i] == 1 && vertexs[i].isVisited() == false) {
          stack.push(i);
          vertexs[i].setVisited(true);
          System.out.println(vertexs[i].getValue());
          currentIndex = stack.peak();
          continue out;
        }
      }
      // 弹出栈顶元素
      stack.pop();
      if (!stack.isEmpty()) {
        currentIndex = stack.peak();
      }
    }
  }

  // 广度优先算法
  public void BFS() {
    vertexs[0].setVisited(true);
    queue.add(0);
    System.out.println(vertexs[0].getValue());
    while (!queue.isEmpty()) {
      for (int i = currentIndex + 1; i < vertexs.length; i++) {
        if (adjMat[currentIndex][i] == 1 && vertexs[i].isVisited() == false) {
          queue.add(i);
          vertexs[i].setVisited(true);
          System.out.println(vertexs[i].getValue());
        }
      }
      // 弹出队列的第一个元素

      if (!queue.isEmpty()) {
        currentIndex = queue.poll();
      } else {
        break;
      }
    }
  }


}
