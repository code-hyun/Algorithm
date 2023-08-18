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
		int cookingTimeInput = Integer.parseInt(br.readLine());
		
		
		int result = H * 60 + M + cookingTimeInput;
		if(result > 1440) {
			 H = (result-1440)/60;  
			 M = (result-1440)%60;  
		}
		else {
			
			H = result / 60;
			M = result % 60;
            if(H == 24) {
				H = 0;
			}
		}
		
		System.out.println(H + " " + M);
	
	}

}
