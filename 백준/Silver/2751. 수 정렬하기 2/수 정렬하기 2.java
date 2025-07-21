import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        ArrayList<Integer> seq = new ArrayList<>();

        for(int i=0; i<N; i++){
            seq.add(Integer.parseInt(bf.readLine()));
        }

        Collections.sort(seq);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(seq.get(i) + "\n");
        }
        System.out.println(sb);
    }
}
