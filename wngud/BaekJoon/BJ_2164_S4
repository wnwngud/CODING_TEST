import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void solution(int N){
        LinkedList<Integer> answer = new LinkedList<Integer>();
        int num = 0;

        for(int i=1; i<=N; i++){
            answer.add(i);
        }

        while(true){
            if(answer.size()==1){
                num = answer.getFirst();
                break;
            }
            answer.removeFirst();
            int first = answer.remove();
            answer.add(first);
        }

        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        solution(N);
    }
}
