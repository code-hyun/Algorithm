
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			sb.append(change(input));
		}
		
		System.out.println(sb);
	}
	public static String change(int input) {
		int quarter = input/25;
		int dime = (input - quarter*25)/10;
		int nickel = (input - quarter*25 - dime*10)/5;
		int penny = (input - quarter*25 - dime*10 - nickel*5)/1;
		
		return quarter + " " + dime + " " + nickel + " " +penny + "\n";
	}

}
         