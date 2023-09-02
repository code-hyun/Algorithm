import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			sb.append(result(num1, num2) + "\n");
			
			
			
		}
		System.out.println(sb);
		
	}
	
	public static String result(int num1, int num2) {
		String result = "";
		
		if(num2 % num1 == 0) {
			result = "factor";
		}else if(num1 % num2 == 0) {
			result = "multiple";
		}else {
			result = "neither";
		}
		
		
		return result;
	}

}
