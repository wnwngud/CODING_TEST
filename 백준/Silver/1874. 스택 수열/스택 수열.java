//import java.util.ArrayList;
//import java.util.Scanner;
//
//class BJ_1874 {
//
//    public static void is_possible(int[] seq){
//        ArrayList<Character> answer = new ArrayList<>();
//        int max = 0;
//        int last_pop = 0;
//
//        for(int i=0; i<seq.length; i++){
//            if(seq[i] > max){
//                for(int j=max; j<seq[i]; j++){
//                    answer.add('+');
//                }
//                max = seq[i];
//                answer.add('-');
//                last_pop = max;
//            }
//            else{
//                if(seq[i] > last_pop) {
//                    System.out.println("NO");
//                    return;
//                }
//                else{
//                    answer.add('-');
//                    last_pop = seq[i];
//                }
//            }
//        }
//
//        for(int i=0; i<answer.size(); i++){
//            System.out.println(answer.get(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] seq = new int[n];
//
//        for(int i=0; i<n; i++){
//            seq[i] = sc.nextInt();
//        }
//
//        is_possible(seq);
//    }
//}

import java.util.Stack;
import java.util.Scanner;

public class Main{
    public static void solution(int[] seq){
        Stack<Integer> stack = new Stack<>();
        StringBuilder st = new StringBuilder();
        int max = 0;

        for(int i=0; i<seq.length; i++){
            if(max < seq[i]){
                for(int j=max+1; j<=seq[i]; j++){
                    stack.push(j);
                    st.append("+\n");
                }
                max = seq[i];
                stack.pop();
                st.append("-\n");
            }
            else {
                if (stack.peek() == seq[i]) {
                    stack.pop();
                    st.append("-\n");
                }
                else{
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] seq = new int[N];

        for(int i=0; i<N; i++){
            seq[i] = sc.nextInt();
        }

        solution(seq);
    }
}