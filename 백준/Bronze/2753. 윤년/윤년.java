import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int input = Integer.parseInt(st.nextToken());
		int result =0;
		if(input % 4 ==0 && input % 100 != 0 || input % 400 == 0) {
			result = 1;
		}else {
			result =0;
		}
		System.out.println(result);
	}

		
	

}
