import java.util.*;

public class Dijkstra {
     static class PathResult {
        List<String> path;
        int distance;
        
        public PathResult(List<String> path, int distance) {
            this.path = path;
            this.distance = distance;
        }
        
        public List<String> getPath() {
            return path;
        }
        
        public int getDistance() {
            return distance;
        }
    }
    
    static class NodeDistance {
        int vertexIndex;
        int distance;
        
        public NodeDistance(int vertexIndex, int distance) {
            this.vertexIndex = vertexIndex;
            this.distance = distance;
        }
    }

    public static PathResult findShortestPath(Graph graph, String start, String end) {
        int startIndex = graph.getIndex(start);
        int endIndex = graph.getIndex(end);
        
        if (startIndex == -1 || endIndex == -1) {
            return new PathResult(new ArrayList<>(), 999999999);
        }
        
        int n = graph.getNumVertices();
        int[] distances = new int[n];
        int[] previous = new int[n];
        boolean[] visited = new boolean[n];
        
        PriorityQueue<NodeDistance> pq = new PriorityQueue<>(Comparator.comparingInt(nd -> nd.distance));
        
        for (int i = 0; i < n; i++) {
            distances[i] = 999999999;
            previous[i] = -1;
        }

        distances[startIndex] = 0;
        pq.offer(new NodeDistance(startIndex, 0));
        
        while (!pq.isEmpty()) {
            NodeDistance current = pq.poll();
            int currentVertex = current.vertexIndex;
            
            if (visited[currentVertex]){
                continue;
            }
            
            visited[currentVertex] = true;
            
            if (currentVertex == endIndex){
                break;
            }
            
            for (Graph.Edge edge : graph.getAdjacentEdges(currentVertex)) {
                int neighbor = edge.getDes();
                int newDist = distances[currentVertex] + edge.getDis();
                
                if (newDist < distances[neighbor]) {
                    distances[neighbor] = newDist;
                    previous[neighbor] = currentVertex;
                    pq.offer(new NodeDistance(neighbor, newDist));
                }
            }
        }
        
        //Buat pathnya lagi
        List<String> path = new ArrayList<>();
        int current = endIndex;
        
        while (current != -1) {
            path.add(0, graph.getVertexName(current));
            current = previous[current];
        }
        
        return new PathResult(path, distances[endIndex]);
    }
}
