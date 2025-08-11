import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] lectures;

    public static int bin_search(int low, int high){
        while(low<high){
            int count = 1;
            int mid = (low+high)/2;
            int remain = mid;
            for(int i=0; i<N; i++){
                if(remain < lectures[i]){
                    remain = mid;
                    count ++;
                }
                remain -= lectures[i];
            }
            if(count == M){
                high = mid;
            }
            else if(count > M){
                low = mid+1;
            }
            else high = mid -1;
        }
        return low;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        lectures = new int[N];

        int maxLength = 0;
        int sum = 0;

        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N; i++){
            lectures[i] = Integer.parseInt(st.nextToken());
            sum+=lectures[i];
            if(maxLength < lectures[i]){
                maxLength = lectures[i];
            }
        }

        System.out.println(bin_search(maxLength, sum));
    }
}
