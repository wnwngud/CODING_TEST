import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BJ_2751 {
//    public static int partition(int left, int right, int[] seq){
//        int low = left;
//        int high = right;
//        int pivot = seq[left];
//
//        while (low<high){
//            while(low <= right && seq[low] <= pivot){
//                low++;
//            }
//            while(high >= left+1 && seq[high] > pivot){
//                high--;
//            }
//
//            if(low < high){
//                int temp = seq[low];
//                seq[low] = seq[high];
//                seq[high] = temp;
//            }
//        }
//
//        int temp = seq[left];
//        seq[left] = seq[high];
//        seq[high] = temp;
//
//        return high;
//    }
//
//    public static void quick_sort(int left, int right, int[] seq) {
//        if(left < right){
//            int point = partition(left, right, seq);
//
//            quick_sort(left, point-1, seq);
//            quick_sort(point+1, right, seq);
//        }
//    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        ArrayList<Integer> seq = new ArrayList<>();
        //int[] seq = new int[N];

        for(int i=0; i<N; i++){
            seq.add(Integer.parseInt(bf.readLine()));
            //seq[i] = Integer.parseInt(bf.readLine());
        }

        Collections.sort(seq);

        //quick_sort(0, N-1, seq);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(seq.get(i) + "\n");
            //sb.append(seq[i] + "\n");
        }
        System.out.println(sb);
    }
}
