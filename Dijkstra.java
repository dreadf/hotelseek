import java.util.*;

public class Dijkstra {
     public int[] dijkstra(int start, int[] parent) {
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        dist[start] = 0;

        PriorityQueue<int[]> pq = 
        new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0];

            if (visited[u]) continue;
            visited[u] = true;

            for (Edge e : adj.get(u)) {
                int v = e.to;
                int w = e.weight;

                if (!visited[v] && dist[u] != Integer.MAX_VALUE &&
                    dist[u] + w < dist[v]) {

                    dist[v] = dist[u] + w;
                    parent[v] = u;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }

        return dist;
    }
}
