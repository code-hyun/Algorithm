import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = 0;
//      int result = 0;
//        while (result < V) {
//            result += A;
//            day++;
//
//            if (result >= V) {
//                break;
//            }
//
//            result -= B;
//        }
        
     // (A-B) : 하루동안 올라가는 거리
     //  마지막날 A 만큼 올라가는것을 고려
        day = (V - B - 1) / (A-B)+1;  
        

        System.out.println(day);
    }
}

