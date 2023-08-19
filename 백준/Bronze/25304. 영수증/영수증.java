import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		int sum =0;
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int product = Integer.parseInt(st.nextToken());
			int productCount = Integer.parseInt(st.nextToken());
			
			sum += product * productCount;
		}
		
		if(sum == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
				
	}

}
