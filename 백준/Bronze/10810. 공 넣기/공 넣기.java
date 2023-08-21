import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int basketSize = Integer.parseInt(st.nextToken());
		int repeat = Integer.parseInt(st.nextToken());
		int[] basketArray = new int[basketSize];
		
		for (int i = 0; i < repeat; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken());
			for(int j = a; j <= b; j++) {
				basketArray[j] = c;
				
			}
		}
		for (int j = 0; j < basketArray.length; j++) {
			System.out.print(basketArray[j] + " ");			
		}
		
		
	
	}

}
