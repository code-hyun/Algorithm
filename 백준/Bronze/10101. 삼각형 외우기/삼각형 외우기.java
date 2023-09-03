import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		Set<Integer> count = new HashSet<>();
		for (int i = 0; i < 3; i++) {
			int input = Integer.parseInt(br.readLine());
			sum += input;
			count.add(input);
		}
		if(sum != 180) {
			System.out.println("Error");
		}else if(count.size() == 1) {
			System.out.println("Equilateral");
		}else if(count.size() == 2) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}
		
		
		
	}	
}
