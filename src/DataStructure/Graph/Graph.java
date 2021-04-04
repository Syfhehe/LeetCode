package DataStructure.Graph;

public class Graph {
  private Vertex[] vertexs;
  private int currentSize;
  public int[][] adjMat;

  public Graph(int size) {
    vertexs = new Vertex[size];
    adjMat = new int[size][size];
  }

  public void addVertex(Vertex v) {
    vertexs[currentSize++] = v;
  }

  // ¡ÏΩ”æÿ’Û
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


}
