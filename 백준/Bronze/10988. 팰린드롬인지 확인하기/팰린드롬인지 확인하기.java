import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int a = 1;
		for(int i = 0; i<input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length()-i-1)) {
				a = 0;
			}
			
		}
		System.out.println(a);
		
		
	}

}
