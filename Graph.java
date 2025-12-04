import java.util.LinkedList;

public class Graph {
    class Edge {
        int destination;
        int distance;

        public Edge(int des, int dis){
            this.destination = des;
            this.distance = dis;
        }

        public int getDes(){
            return destination;
        }

        public int getDis(){
            return distance;
        }
    }

    private int nVertices;
    private LinkedList<Edge>[] adjacencyList;
    private String[] vertices;

    public Graph(int nVertices, String[] vertices){
        this.nVertices = nVertices;
        this.vertices = vertices;
        this.adjacencyList = new LinkedList[nVertices];

        for(int i = 0; i < nVertices; i++){
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public int getNumVertices(){
        return nVertices;
    }

    public String[] vertices(){
        return vertices;
    }

    public void addEdge(int a, int b, int distance){
        adjacencyList[a].add(new Edge(b, distance));
        adjacencyList[b].add(new Edge(a, distance));
    }

    public int getIndex(String name){
      for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
