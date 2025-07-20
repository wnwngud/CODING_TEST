import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> seq = new ArrayList<>();

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++){
            seq.add(i, Integer.parseInt(st.nextToken()));
        }

        Collections.sort(seq);

        System.out.println(seq.get(K-1));
    }
}
