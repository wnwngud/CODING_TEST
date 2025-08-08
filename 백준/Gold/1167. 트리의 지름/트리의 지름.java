import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int V;
    static boolean[] visited;
    static ArrayList<Integer>[] route;
    static int max = 0;
    static int max_node;

    public static void solution(int V, int len){
        if(len > max){
            max = len;
            max_node = V;
        }
        visited[V]=true;
        for(int i=0; i<route[V].size(); i+=2){
            if(!visited[route[V].get(i)]){
                solution(route[V].get(i), route[V].get(i+1) + len);
            }
        }
        visited[V] = false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        V = Integer.parseInt(st.nextToken());
        visited = new boolean[V+1];
        route = new ArrayList[V+1];

        for(int i=0; i<V+1; i++){
            route[i] = new ArrayList<>();
        }

        for(int i=0; i<V; i++){
            st = new StringTokenizer(bf.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            while(true){
                int vertex = Integer.parseInt(st.nextToken());
                if(vertex==-1) break;
                int length = Integer.parseInt(st.nextToken());
                route[num].add(vertex);
                route[num].add(length);
            }
        }

        solution(1, 0);
        solution(max_node, 0);

        System.out.println(max);
    }
}
