import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int i = 1;
        boolean find = false; 

        while (i < input) { 
            String num = String.valueOf(i);
            int sum = i;

            for (int j = 0; j < num.length(); j++) {
                sum += num.charAt(j) - '0';
            }

            if (sum == input) {
                System.out.println(i);
                find = true;
                break;
            }

            i++;
        }

        if (!find) {
            System.out.println(0);
        }
    }
}
