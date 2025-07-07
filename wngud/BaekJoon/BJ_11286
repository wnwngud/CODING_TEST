import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.io.BufferedReader;

class comp implements Comparator<Integer> {
    public int compare(Integer a, Integer b){
        if(Math.abs(a) == Math.abs(b)){
            if(a>b) return 1;
            else if (a<b) return -1;
            else return 0;
        }
        else {
            return Integer.compare(Math.abs(a), Math.abs(b));
        }
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new comp());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(bf.readLine());
            if(num==0){
                if(pq.isEmpty()){
                    sb.append("0\n");
                }
                else sb.append(pq.poll() + "\n");
            }
            else pq.add(num);
        }

        System.out.print(sb);
    }
}
