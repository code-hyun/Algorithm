import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int n = input / 5;
		
		int i = 0;
		while(true) {
			if(input % 5 == 0) {
				System.out.println(input / 5);
				break;
			}else if((input % 5) % 3 == 0) {
				System.out.println(input / 5 + input % 5 / 3);
				break;
			}
			
			if(n > 0) {
				n = n - 1;
				
				if((input - n * 5 ) % 3 == 0) {
					System.out.println(n + (input - n * 5 ) / 3);
					break;
				}
				
			}else {
				if(input % 3 == 0) {
					System.out.println(input/3);
					break;
				}else {
					System.out.println(-1);
					break;
				}
			}
			
				
				
			
			
			
			
			
			
		}
		
	}
		
		
		
		
}
	

