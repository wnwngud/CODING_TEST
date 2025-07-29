import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

    public static void dfs(ArrayList<Integer>[] graph, boolean[] visited, int x){
        visited[x] = true;
        for(int i=0; i<graph[x].size(); i++){
            if(!visited[graph[x].get(i)])
                dfs(graph, visited, graph[x].get(i));
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[N+1];
        boolean[] visited = new boolean[N+1];

        for(int i=0; i<N+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        int num_connection = 0;

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                num_connection++;
                dfs(graph, visited, i);
            }
        }

        System.out.println(num_connection);
    }
}
