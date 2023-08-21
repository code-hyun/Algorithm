import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int[] positions = new int[26];  // 알파벳 개수만큼 배열 생성 및 초기화

        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;  // 초기값으로 설정
        }

        for (int j = 0; j < st.length(); j++) {
            char c = st.charAt(j);
            if (positions[c - 'a'] == -1) {  // 처음 등장한 경우에만 위치 저장
                positions[c - 'a'] = j;
            }
        }

        for (int position : positions) {
            System.out.print(position + " ");
        }
    }
}
