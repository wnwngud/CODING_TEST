import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void solution(int N, int[] seq){
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]){
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            seq[stack.peek()] = -1;
            stack.pop();
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<seq.length; i++){
            sb.append(seq[i] + " ");
        }

        System.out.println(sb);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }

        solution(N, seq);
    }
}
