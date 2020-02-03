//import java.io.*;
//import java.util.*;
//
//public class JA_1809 {
//    public static class Set{
//        int size;
//        int idx;
//
//        public Set(int size, int idx) {
//            this.size = size;
//            this.idx = idx;
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        Scanner sc= new Scanner(System.in);
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       // StringTokenizer st = new StringTokenizer((br.readLine()));
//
//        List<Integer> arr = new ArrayList<>();
//        int k = Integer.parseInt(br.readLine());
//
//        Stack<Set> s = new Stack<>();
//        arr.add(0);
//        StringTokenizer st = new StringTokenizer((br.readLine()));
//        for (int i = 0; i < k; i++) {
//
//            int num = Integer.parseInt(st.nextToken());
//            while(!s.empty()){
//
//                if(s.peek().size < num){
//                    s.pop();
//                    if(s.empty()) arr.add(0);
//
//                }
//                else{
//                    arr.add(s.peek().idx);
//                    break;
//
//                }
//            }
//            s.push(new Set(num,i+1));
//
//        }
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        for (int i = 0; i < arr.size(); i++) {
//            bw.write(arr.get(i).toString()+" ");
//        }
//        bw.flush();
//        bw.close();
//    }
//}
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static class Set{
        int size;
        int idx;

        public Set(int size, int idx) {
            this.size = size;
            this.idx = idx;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        int k = sc.nextInt();
        Stack<Set> s = new Stack<>();
        arr.add(0);
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            while(!s.empty()){

                if(s.peek().size < num){
                    s.pop();
                    if(s.empty()) arr.add(0);

                }
                else{
                    arr.add(s.peek().idx);
                    break;

                }
            }
            s.push(new Set(num,i+1));
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < arr.size(); i++) {
            bw.write(arr.get(i).toString()+" ");
        }
        bw.flush();
        bw.close();
    }
}