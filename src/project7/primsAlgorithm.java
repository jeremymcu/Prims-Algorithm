package project7;

public class primsAlgorithm {
    void prims(int[][] graph, int len, int start){
        boolean[] visit = new boolean[len];
        int[] parent = new int[len];

        for(int i=0; i<len; i+=1)
            visit[i] = false;

        visit[start] = true;
        parent[start] = 0;

        for (int i=0; i<len; i+=1){
            int min = Integer.MAX_VALUE;
            int min_index = 0;
            int min_parent = 0;
            for (int j=0; j<len; j+=1){
                for (int x=0; x<len; x+=1){
                    if (visit[j] && graph[j][x]<min && graph[j][x] != 0 && !visit[x]){
                        min = graph[j][x];
                        min_index = x;
                        min_parent = j;
                    }
                }
            }

            visit[min_index] = true;
            parent[min_index] = min_parent;
        }

        System.out.println("Edge \tWeight");
        for (int i=0; i<len; i+=1){
            System.out.println(parent[i] + " - " + i + " = " + graph[parent[i]][i]);
        }

    }
}
