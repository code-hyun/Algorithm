import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		List<Integer> factor = new ArrayList<>();
		
		for (int i = 1; i <= num1; i++) {
			if(num1 % i == 0) {
				factor.add(i);
			}
		}
		if(num2 <= factor.size()) {
			System.out.println(factor.get(num2-1));
		}else {
			
			System.out.println(0);
		}
			
			
			
		
	}
	
	

}
