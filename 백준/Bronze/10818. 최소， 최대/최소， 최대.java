
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int array[] = new int[N];
		String result = "";
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i =0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0;
		int end = N-1;
		int min = array[start];
		int max = array[start];
		while(start <= end) {
			min = Math.min(min, array[start]);
			max = Math.max(max, array[start]);
			start++;
		}
		
		System.out.println(min + " " + max);
		
		
		
	}

}
