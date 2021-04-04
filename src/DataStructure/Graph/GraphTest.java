package DataStructure.Graph;

import java.util.Arrays;

public class GraphTest {

  public static void main(String[] args) {
    Vertex v1 = new Vertex("1");
    Vertex v2 = new Vertex("2");
    Vertex v3 = new Vertex("3");
    Vertex v4 = new Vertex("4");
    Vertex v5 = new Vertex("5");
    Vertex v6 = new Vertex("6");
    Vertex v7 = new Vertex("7");
    Vertex v8 = new Vertex("8");

    Graph g1 = new Graph(8);
    g1.addVertex(v1);
    g1.addVertex(v2);
    g1.addVertex(v3);
    g1.addVertex(v4);
    g1.addVertex(v5);
    g1.addVertex(v6);
    g1.addVertex(v7);
    g1.addVertex(v8);

    g1.addEdge("1", "2");
    g1.addEdge("2", "4");
    g1.addEdge("2", "5");
    g1.addEdge("4", "8");
    g1.addEdge("5", "8");
    g1.addEdge("1", "3");
    g1.addEdge("3", "6");
    g1.addEdge("3", "7");
    g1.addEdge("6", "7");

    for (int[] a : g1.adjMat) {
      System.out.println(Arrays.toString(a));
    }
    System.out.println("-----------------------");
    g1.DFS();
    System.out.println("-----------------------");
    g1.BFS();
  }

}
