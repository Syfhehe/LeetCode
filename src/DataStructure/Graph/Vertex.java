package DataStructure.Graph;

//¶¥µã
public class Vertex {
  private String value;
  private boolean visited;

  public Vertex(String string) {
    this.value = string;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

}
