import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[][] arr = new int[N+1][2];

        for(int i=1; i<=N; i++){
            int num = Integer.parseInt(bf.readLine());
            arr[i][0] = num;
            arr[i][1] = i;
        }

        Arrays.sort(arr, Comparator.comparingInt(o->o[0]));

        int max = 0;
        for(int i=1; i<=N; i++){
            max = Math.max(max, arr[i][1]-i);
        }

        System.out.println(max+1);
    }
}