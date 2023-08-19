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
		int min = array[0];
		int max = array[0];
		
		for(int i =0; i < N; i++) {
			if(min > array[i]) {
				min = array[i];
			}
			if(max < array[i]) {
				max = array[i];
			}
			result = min + " " + max;
		}
		System.out.println(result);
		
		
		
	}

}
