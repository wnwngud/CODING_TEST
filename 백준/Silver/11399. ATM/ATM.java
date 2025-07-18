import java.util.Scanner;

public class Main {
    public static int partition(int left, int right, int[] seq){
        int low = left;
        int high = right+1;
        int pivot = seq[left];

        do{
            do{
                low++;
            }while(low<=right && seq[low] < pivot);
            do{
                high--;
            }while(high>=left && seq[high] > pivot);

            if(low < high){
                int temp = seq[low];
                seq[low] = seq[high];
                seq[high] = temp;
            }
        }while(low < high);

        int temp = seq[left];
        seq[left] = seq[high];
        seq[high] = temp;
        return high;
    }
    public static void quick_sort(int left, int right, int[] seq){
        if(left < right){
            int p = partition(left, right, seq);

            quick_sort(left, p-1, seq);
            quick_sort(p+1, right, seq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] seq = new int[N];

        for(int i=0; i<N; i++){
            seq[i] = sc.nextInt();
        }

        quick_sort(0, N-1, seq);

        int sum = 0;

        for(int i=0; i<N; i++){
            sum+=(seq[i] * (N-i));
        }
        System.out.println(sum);
    }
}
