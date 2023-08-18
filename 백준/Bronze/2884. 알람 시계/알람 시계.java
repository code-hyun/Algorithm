import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		
		int result = H * 60 + M - 45;
		if(result < 0) {
			 H = (1440 + result)/60;  
			 M = (1440 + result)%60;  
		}
		else {
			
			H = result / 60;
			M = result % 60;
		}
		
		System.out.println(H + " " + M);
	
	}

}
