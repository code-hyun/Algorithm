
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] input = new int[chess.length];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < input.length; i++) {
			if(input[i] == chess[i]) {
				input[i] = 0;
			}else {
				input[i] = chess[i] - input[i];
			}
		}
			
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		
		
	}

}
