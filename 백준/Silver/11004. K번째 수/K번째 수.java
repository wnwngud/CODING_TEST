import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/*
주석처리된 코드는 직접 퀵정렬을 구현했을 때의 코드
-> 시간초과
Collections.sort()를 사용했을 때는 통과

무슨 차이이지?
*/

public class Main {
    //    public static int partition(int left, int right, int[] seq) {
//        int low = left;
//        int high = right + 1;
//        int pivot = seq[low];
//
//        do {
//            do {
//                low++;
//            } while (low <= right && seq[low] < pivot);
//            do {
//                high--;
//            } while (high >= left && seq[high] > pivot);
//
//            if (low < high) {
//                int temp = seq[low];
//                seq[low] = seq[high];
//                seq[high] = temp;
//            }
//
//        } while(low < high);
//
//        int temp = seq[left];
//        seq[left] = seq[high];
//        seq[high] = temp;
//
//        return high;
//    }
//
//    public static void quicksort(int left, int right, int[]seq){
//        if(left < right){
//            int p = partition(left, right, seq);
//
//            quicksort(left, p-1, seq);
//            quicksort(p+1, right, seq);
//        }
//    }
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int[] seq = new int[N];
//
//        st = new StringTokenizer(bf.readLine(), " ");
//        for(int i=0; i<N; i++){
//            seq[i] = Integer.parseInt(st.nextToken());
//        }
//
//        quicksort(0, N-1, seq);
//
//        System.out.println(seq[K-1]);
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> seq = new ArrayList<>();

        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            seq.add(i, Integer.parseInt(st.nextToken()));
        }

        Collections.sort(seq);

        System.out.println(seq.get(K - 1));
    }
}
