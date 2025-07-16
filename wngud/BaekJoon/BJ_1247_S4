import java.io.*;

public class Main {
    public static int partition(int left, int right, char[] seq){
        int low = left;
        int high = right+1;
        char pivot = seq[low];

        do{
            do{
                low++;
            }while(low <= right && seq[low] > pivot);

            do{
                high--;
            }while(high >= left && seq[high] < pivot);

            if(low < high){
                char temp = seq[low];
                seq[low] = seq[high];
                seq[high] = temp;
            }

        } while(low < high);

        char temp = seq[left];
        seq[left] = seq[high];
        seq[high] = temp;

        return high;
    }

    public static void quick_sort(int left, int right, char[] seq){
        if(left < right){
            int p = partition(left, right, seq);

            quick_sort(left, p-1, seq);
            quick_sort(p+1, right, seq);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        char[] seq = new char[line.length()];

        for(int i=0; i<line.length(); i++){
            seq[i] = line.charAt(i);
        }

        quick_sort(0, seq.length-1, seq);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<seq.length; i++){
            sb.append(seq[i]);
        }
        System.out.println(sb);
    }
}
