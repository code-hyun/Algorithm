import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String[] input = br.readLine().split(" ");
            int[] tri = new int[3];
            for (int i = 0; i < 3; i++) {
                tri[i] = Integer.parseInt(input[i]);
            }
            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0) {
                break;
            }
            
            Arrays.sort(tri);
            if (tri[2] >= tri[1] + tri[0]) {
                sb.append("Invalid\n");
            } else {
                if (tri[0] == tri[1] && tri[1] == tri[2]) {
                    sb.append("Equilateral\n");
                } else if (tri[0] == tri[1] || tri[1] == tri[2]) {
                    sb.append("Isosceles\n");
                } else {
                    sb.append("Scalene\n");
                }
            }
        }
        
        System.out.println(sb.toString());
    }
}

      
