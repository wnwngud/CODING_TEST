import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static boolean dfs(boolean[] visited, ArrayList<Integer>[] friend, int i, int depth){
        if(depth==4) return true;
        visited[i]=true;
        for(int j=0; j<friend[i].size(); j++){
            if(!visited[friend[i].get(j)]){
                if(dfs(visited, friend, friend[i].get(j), depth+1)) return true;
            }
        }
        visited[i]=false; // 아래 다음 for문에서도 해당 노드를 다시 봐야할 일이 생길 수 있기 때문에.
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N];
        ArrayList<Integer>[] friend = new ArrayList[N];
        for(int i=0; i<N; i++){
            friend[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            friend[x].add(y);
            friend[y].add(x);
        }

        for(int i=0; i<N; i++){
            if(dfs(visited, friend, i, 0)) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
