import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        // A C G T
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // DNA 문자열 길이
        int S = Integer.parseInt(st.nextToken());
        // 부분 문자열 길이
        int P = Integer.parseInt(st.nextToken());
        String strDNA = br.readLine();
        int[] n = new int[4];

        int count = 0;
        // 부분 문자열에 포함돼야 할 ACGT의 개수
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        int[] currentCount = new int[4];
        // 초기 부분 문자열에 대한 ACGT 개수 계산
        for (int i = 0; i < P; i++) {
            char ch = strDNA.charAt(i);
            if (ch == 'A') {
                currentCount[0]++;
            } else if (ch == 'C') {
                currentCount[1]++;
            } else if (ch == 'G') {
                currentCount[2]++;
            } else if (ch == 'T') {
                currentCount[3]++;
            }
        }

        for (int i = 0; i <= S - P; i++) {
            if (currentCount[0] >= n[0] && currentCount[1] >= n[1] && currentCount[2] >= n[2] && currentCount[3] >= n[3]) {
                count++;
            }

            // 다음 부분 문자열로 이동하면서 개수 갱신
            if (i < S - P) {
                char removedChar = strDNA.charAt(i);
                char addedChar = strDNA.charAt(i + P);
                if (removedChar == 'A') {
                    currentCount[0]--;
                } else if (removedChar == 'C') {
                    currentCount[1]--;
                } else if (removedChar == 'G') {
                    currentCount[2]--;
                } else if (removedChar == 'T') {
                    currentCount[3]--;
                }
                if (addedChar == 'A') {
                    currentCount[0]++;
                } else if (addedChar == 'C') {
                    currentCount[1]++;
                } else if (addedChar == 'G') {
                    currentCount[2]++;
                } else if (addedChar == 'T') {
                    currentCount[3]++;
                }
            }
        }

        System.out.println(count);
    }
}
