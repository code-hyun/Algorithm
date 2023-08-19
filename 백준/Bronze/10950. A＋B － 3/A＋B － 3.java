import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int input = Integer.parseInt(br.readLine());
        int a[] = new int[input];
        int b[] = new int[input];

        for (int i = 0; i < input; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < input; i++) {
            System.out.println(a[i] + b[i]);
        }

        br.close();
    }
}
