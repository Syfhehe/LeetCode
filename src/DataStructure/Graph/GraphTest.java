package DataStructure.Graph;

import java.util.Arrays;

public class GraphTest {
  
  public static void main(String[] args) {
    Vertex v1 = new Vertex("A");
    Vertex v2 = new Vertex("B");
    Vertex v3 = new Vertex("C");
    Vertex v4 = new Vertex("D");
    Vertex v5 = new Vertex("E");

    Graph g1 = new Graph(5);
    g1.addVertex(v1);
    g1.addVertex(v2);
    g1.addVertex(v3);
    g1.addVertex(v4);
    g1.addVertex(v5);

    g1.addEdge("A", "C");
    g1.addEdge("B", "C");
    g1.addEdge("A", "B");
    g1.addEdge("B", "D");
    g1.addEdge("B", "E");

    for (int[] a:g1.adjMat) {
      System.out.println(Arrays.toString(a));
    }
    
    g1.dfs();
  }

}
