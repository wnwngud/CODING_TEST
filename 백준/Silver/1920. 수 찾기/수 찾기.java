import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] N_arr;
    static int M;
    static int[] M_arr;

    public static boolean bin_search(int low, int high, int X){
        int mid = (low+high)/2;
        if(low <= high) {
            if (N_arr[mid] > X) {
                return bin_search(low, mid - 1, X);
            } else if (N_arr[mid] < X) {
                return bin_search(mid + 1, high, X);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        N_arr = new int[N];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(N_arr);

        M = Integer.parseInt(bf.readLine());
        M_arr = new int[M];

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<M; i++){
            M_arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<M; i++){
            if(bin_search(0, N-1, M_arr[i])){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}
